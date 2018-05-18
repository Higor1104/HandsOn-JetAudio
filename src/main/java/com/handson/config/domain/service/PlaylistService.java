package com.handson.config.domain.service;

import java.util.List;

import com.handson.config.domain.model.Playlist;

public interface PlaylistService {

	List<Playlist> findAll();
	
}