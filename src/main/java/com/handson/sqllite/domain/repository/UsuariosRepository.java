package com.handson.sqllite.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.handson.sqllite.domain.model.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, String>{

	List<Usuarios> findByNome(String nome);
	
}
