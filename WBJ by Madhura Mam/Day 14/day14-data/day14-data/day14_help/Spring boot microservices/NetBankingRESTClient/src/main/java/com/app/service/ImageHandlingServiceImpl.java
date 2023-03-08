package com.app.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.EmployeeRepository;
import com.app.dto.EmployeeDto;
import com.app.entities.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ImageHandlingServiceImpl implements ImageHandlingService {
	// dep : emp repo
	@Autowired
	private EmployeeRepository empRepo;// will be used for retrieving emp dtls
	// dep : server side folder location
	@Value("${file.upload.location}")
	private String folderLocation;

	// dep : model mapper
	@Autowired
	private ModelMapper mapper;

	@PostConstruct
	public void anyInit() {
		// chk if folder exists --if not create one !
		// java.io.File => represents abstract path to a file /folder
		File folder = new File(folderLocation);
		if (!folder.exists()) {
			folder.mkdirs();
			log.info("folder created....");
		} else
			log.info("folder alrdy exists !");
	}

	@Override
	public EmployeeDto saveImage(long empId, MultipartFile imgFile) throws IOException {
		// get emp dtls from emp id
		Employee emp = empRepo.findById(empId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID : Can't save image !!!!!!!"));
		// =>valid emp id , set image path in db
		// OR to store the image in DB : emp.setImage(imgFile.getBytes()); --update
		// --img will be stored
		// create absolute path to the image file n save it in DB
		String path = folderLocation + File.separator + imgFile.getOriginalFilename();

		log.info("path {}", path);
		emp.setImagePath(path);// update query upon commit
		// copy uploaded multipart file to server side folder
		// java.nio.file.Files : copy(InputStream in , Path dest, CopyOptions.. ops)
		// Paths.get(String path) ---> Path
		Files.copy(imgFile.getInputStream(), Paths.get(path), StandardCopyOption.REPLACE_EXISTING);
		log.info("file copied emp : {}", emp);
		EmployeeDto dto = mapper.map(emp, EmployeeDto.class);
		return dto;
	}

	// method for restoring an image
	@Override
	public byte[] restoreImage(long empId) throws IOException {
		// get emp dtls from emp id
		Employee emp = empRepo.findById(empId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID : Can't save image !!!!!!!"));
		// =>valid emp id ,get image path from db
		String path = emp.getImagePath();// OR in case of img stored in DB : emp.getImage() ---> byte[]
		// java.nio.file.Files : public byte[] readAllBytes(Path path) throws IOExc
		if (path != null)
			return Files.readAllBytes(Paths.get(path));
		// => image is not yet assigned --throw exc to alert front end
		throw new ResourceNotFoundException("Image not  yet assigned , for emp " + emp.getLastName());
	}

}
