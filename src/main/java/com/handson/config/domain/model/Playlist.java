package com.handson.config.domain.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Playlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private List<Music> musics;

}
