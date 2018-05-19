package com.handson.sqllite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.domain.repository.UsuariosRepository;

@RestController
@RequestMapping("users")
public class UsuariosController {

	private static final Logger logger = LoggerFactory.getLogger(UsuariosController.class);

	private UsuariosRepository usuariosRepository;

	public UsuariosController(UsuariosRepository usuariosRepository) {
		super();
		this.usuariosRepository = usuariosRepository;
	}

	@GetMapping
	public ResponseEntity<String> getAllMusic(){
		System.out.println(usuariosRepository.findAll());
		return ResponseEntity.ok("Hello, World!");
	}
	
}
