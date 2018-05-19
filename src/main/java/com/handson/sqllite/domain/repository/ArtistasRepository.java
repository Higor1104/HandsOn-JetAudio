package com.handson.sqllite.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.handson.sqllite.domain.model.Artistas;
import com.handson.sqllite.domain.model.Musicas;

@Repository
public interface ArtistasRepository extends CrudRepository<Artistas, String> {

	@Query(value = "SELECT musicas FROM Artistas WHERE nome LIKE :nome_")
	List<Musicas> findByNomeStartsWith(@Param("nome_") String nome);
	
}
