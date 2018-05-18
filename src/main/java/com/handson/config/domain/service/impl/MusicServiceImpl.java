package com.handson.config.domain.service.impl;

import com.handson.config.domain.model.Music;
import com.handson.config.domain.service.MusicService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {

	@Override
	public List<Music> getAll() {
		return null;
	}
}
