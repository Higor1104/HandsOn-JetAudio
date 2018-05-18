package com.handson.sqllite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/musics")
public class MusicController {

	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);

	public MusicController() {
		super();
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<String> getAllMusic(){
		return ResponseEntity.ok("Hello, World!");
	}
	
}
