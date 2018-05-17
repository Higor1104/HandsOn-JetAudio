package com.handson.config.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.handson.config.domain.model.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, String>{

	List<Music> findByName(String name);
	
}
