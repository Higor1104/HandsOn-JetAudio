package com.handson.sqllite.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artistas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "artista", targetEntity = Musicas.class)
	private List<Musicas> musicas;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Musicas> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musicas> musicas) {
		this.musicas = musicas;
	}

	public String toString() {
		return new String().concat("id:").concat(this.id).concat(this.id).concat(" nome: ").concat(this.nome);  
	}

}
