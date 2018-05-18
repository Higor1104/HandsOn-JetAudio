package com.handson.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.config.domain.model.Playlist;
import com.handson.config.domain.service.PlaylistService;

@RestController
@RequestMapping(path = "/playlists", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaylistController {
	
	private static final Logger logger = LoggerFactory.getLogger(PlaylistController.class);
	
	@Autowired
	private PlaylistService playlistService;
	
	public PlaylistController() {
		super();
	}
	
	@GetMapping("/")
	public List<Playlist> findAll() {
		return playlistService.findAll();
	}
	
}
