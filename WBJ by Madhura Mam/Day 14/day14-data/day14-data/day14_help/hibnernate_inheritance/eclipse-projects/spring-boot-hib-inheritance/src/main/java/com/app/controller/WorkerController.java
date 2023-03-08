package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.WorkerRepository;
import com.app.pojos.Worker;
@RestController
@RequestMapping("/workers")
public class WorkerController {
	@Autowired
	private WorkerRepository workerRepo;
	@PostMapping
	public ResponseEntity<?> addWorker(@RequestBody Worker m)
	{
		System.out.println("in add worker "+m);
		Worker savedWorker = workerRepo.save(m);
		return ResponseEntity.ok().body(savedWorker);
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getWorker(@PathVariable int id)
	{
		return ResponseEntity.ok(workerRepo.findById(id).get());
	}
}

