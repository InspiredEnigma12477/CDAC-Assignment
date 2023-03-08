package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ManagerRepository;
import com.app.pojos.Manager;
@RestController
@RequestMapping("/managers")
public class ManagerController {
	@Autowired
	private ManagerRepository mgrRepo;
	@PostMapping
	public ResponseEntity<?> addManager(@RequestBody Manager m)
	{
		System.out.println("in add mgr "+m);
		Manager savedMgr = mgrRepo.save(m);
		return ResponseEntity.ok().body(savedMgr);
	}
}
