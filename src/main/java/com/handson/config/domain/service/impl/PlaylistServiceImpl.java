package com.handson.config.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handson.config.domain.model.Playlist;
import com.handson.config.domain.repository.PlaylistRepository;
import com.handson.config.domain.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	private PlaylistRepository playlistRepository;
	
	public PlaylistServiceImpl() {
		super();
	}
	
	public List<Playlist> findAll() {
		return (List<Playlist>) this.playlistRepository.findAll();
	}
}