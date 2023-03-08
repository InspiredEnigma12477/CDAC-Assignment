package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Category;

public interface CategoryDao extends JpaRepository<Category,Long>{
//add a method to ret all categories
//	List<Category> getAllCategories();//to be replaced by findAll : inherited API from JpaRepo.
}
