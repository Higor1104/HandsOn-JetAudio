package com.handson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.config.domain.model.Playlist;
import com.handson.config.domain.service.PlaylistService;

@RestController
@RequestMapping(path = "/api/playlists", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaylistController {
	
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
