package com.handson.sqllite.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Musicas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String nome;
	
	@OneToOne
	private Artistas artista;
	
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

	public Artistas getArtista() {
		return artista;
	}

	public void setArtista(Artistas artista) {
		this.artista = artista;
	}

	public String toString() {
		return new String().concat("id:").concat(this.id).concat(this.id).concat(" nome: ").concat(this.nome);  
	}

}
