package com.handson.config.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.handson.config.domain.model.Playlist;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, String> {
	
}