package com.handson.config.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.handson.config.domain.model.Playlist;

public interface PlaylistRepository extends CrudRepository<Playlist, Long> {
	
}