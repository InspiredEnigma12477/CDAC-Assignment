package com.app.service;

import java.util.List;

import com.app.pojos.ToDo;

public interface IToDoService {

	List<ToDo> getTodos(String userName);

	void deleteToDo(long id);

	ToDo findById(long id);

	ToDo saveOrUpdate(String userName, ToDo t);

}