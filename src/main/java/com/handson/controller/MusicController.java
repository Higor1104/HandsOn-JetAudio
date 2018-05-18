package com.handson.controller;

import com.handson.config.domain.service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("api/music")
public class MusicController {

	private static final Logger logger = LoggerFactory.getLogger(MusicController.class);

	private  MusicService musicService;
	
	@Autowired
	MusicController controller;

	public MusicController(MusicService musicService) {
		this.musicService = musicService;
	}

	@GetMapping("/")
	public String getAllMusic(){
		musicService.getAll();

		return "";
	}
	
}
