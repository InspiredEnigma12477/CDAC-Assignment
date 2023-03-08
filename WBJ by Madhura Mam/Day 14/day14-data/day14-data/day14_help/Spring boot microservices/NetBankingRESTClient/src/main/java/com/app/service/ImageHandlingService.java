package com.app.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.EmployeeDto;

public interface ImageHandlingService {
	EmployeeDto saveImage(long empId, MultipartFile imgFile) throws IOException;

	byte[] restoreImage(long empId) throws IOException;
}
