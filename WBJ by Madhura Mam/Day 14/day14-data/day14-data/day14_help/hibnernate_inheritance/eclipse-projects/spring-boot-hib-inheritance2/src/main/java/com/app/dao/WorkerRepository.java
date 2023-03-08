package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

}
