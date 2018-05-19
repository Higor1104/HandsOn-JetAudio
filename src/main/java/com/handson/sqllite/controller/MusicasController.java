package com.handson.sqllite.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.domain.model.Musicas;
import com.handson.sqllite.domain.repository.ArtistasRepository;
import com.handson.sqllite.domain.repository.MusicasRepository;

@RestController
@RequestMapping("/musicas")
public class MusicasController {

	private static final Logger logger = LoggerFactory.getLogger(MusicasController.class);

	private MusicasRepository musicasRepository;

	private ArtistasRepository artistasRepository;
	public MusicasController(MusicasRepository musicasRepository,
								ArtistasRepository artistasRepository) {
		super();
		this.musicasRepository = musicasRepository;
		this.artistasRepository = artistasRepository;
	}

	@GetMapping
	public ResponseEntity<Set<Musicas>> getAllMusic(@RequestParam String filtro) {
		logger.info("Pesquisando musicas...");
		if (StringUtils.trimAllWhitespace(filtro).length() < 3) {
			return new ResponseEntity<Set<Musicas>>(HttpStatus.BAD_REQUEST);	
		}
		List<Musicas> _musicas = this.musicasRepository.findByNomeStartsWith(filtro);
		List<Musicas> _musicasByArtistas = this.artistasRepository.findByNomeStartsWith(filtro);
		Set<Musicas> _musicasReturn = new HashSet<>(_musicas.size() + _musicasByArtistas.size());
		_musicasReturn.addAll(_musicas);
		_musicasReturn.addAll(_musicasByArtistas);
		HttpStatus httpStatus = _musicas.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.ACCEPTED;
		return new ResponseEntity<Set<Musicas>>(_musicasReturn, httpStatus);
	}
	
}
