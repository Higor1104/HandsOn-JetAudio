package com.handson.sqllite.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.handson.sqllite.domain.model.Musicas;

@Repository
public interface MusicasRepository extends CrudRepository<Musicas, String> {

	List<Musicas> findByNomeStartsWith(String nome);
	
}
