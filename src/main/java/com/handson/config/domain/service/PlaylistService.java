package com.handson.config.domain.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handson.config.domain.model.Playlist;
import com.handson.config.domain.repository.PlaylistRepository;

@Service
public class PlaylistService implements Serializable {
	private static final long serialVersionUID = 2530338294389534147L;
	
	@Autowired
	private PlaylistRepository playlistRepository;
	
	public PlaylistService() {
		super();
	}
	
	public List<Playlist> findAll() {
		return (List<Playlist>) this.playlistRepository.findAll();
	}
}