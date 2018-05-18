package com.handson.sqllite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/playlists")
public class PlaylistController {
	
	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);
	
	public PlaylistController() {
		super();
	}
	
	@GetMapping("/")
	public String index() {
		return "Teste";
	}
}
