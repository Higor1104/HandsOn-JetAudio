package com.handson.config.domain.model;

import javax.persistence.*;

@Entity
public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String nome;
	private String artistaId;

	@OneToOne
	@JoinColumn(name = "artist_id")
	private Artist artist;
	
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
	public String getArtistaId() {
		return artistaId;
	}
	public void setArtistaId(String artistaId) {
		this.artistaId = artistaId;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	
}
