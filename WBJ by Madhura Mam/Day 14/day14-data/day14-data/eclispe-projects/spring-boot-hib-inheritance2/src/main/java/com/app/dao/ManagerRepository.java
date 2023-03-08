package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Manager;

public interface ManagerRepository extends JpaRepository<Manager,Integer> {

}
