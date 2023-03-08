package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	List<ToDo> findByUserUserName(String userName);

	List<ToDo> findByDescContaining(String keyword);
/*
 * @Query("SELECT e FROM Employee e WHERE e.name LIKE %?1%")
  public List<Employee> findByName2(String name);
 */
	@Query("select t.desc from ToDo t where t.desc like %?1%")
	List<String> fetchToDoDesc(String keyword);
}
