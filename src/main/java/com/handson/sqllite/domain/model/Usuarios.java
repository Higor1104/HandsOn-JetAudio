package com.handson.sqllite.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private String nome;
	
	@OneToOne
	private Playlists playlists;
	
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
	
	public Playlists getPlaylists() {
		return playlists;
	}

	public void setPlaylists(Playlists playlists) {
		this.playlists = playlists;
	}
	
	public String toString() {
		String _return = new String().concat("id:").concat(this.id).concat(" nome: ").concat(this.nome);
		if (null != this.playlists) {
			_return = _return.concat(" playlist: ").concat(this.playlists.getId());
		}
		return _return.concat("\n");
	}

}
