package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ToDoRepository;
import com.app.dao.UserRepository;
import com.app.pojos.ToDo;
import com.app.pojos.User;

@Service
public class ToDoService implements IToDoService {
	@Autowired
	private ToDoRepository todoRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<ToDo> getTodos(String userName) {
		return todoRepo.findByUserUserName(userName);
	}

	@Override
	public void deleteToDo(long id) {
		ToDo foundToDo = findById(id);
		todoRepo.delete(foundToDo);

	}

	@Override
	public ToDo findById(long id) {
		return todoRepo.findById(id).orElseThrow(() -> new RuntimeException("ToDo Not Found"));
	}

	@Override
	public ToDo saveOrUpdate(String userName, ToDo t) {
		User user = userRepo.fetchUserDetails(userName).orElseThrow(() -> new RuntimeException("User Name Not Found"));
		t.setUser(user);
		return todoRepo.save(t);
	}

}
