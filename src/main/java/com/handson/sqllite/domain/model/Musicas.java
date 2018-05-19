package com.handson.sqllite.domain.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Musicas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
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
		String _return = new String().concat("id:").concat(this.id).concat(" nome: ").concat(this.nome);
		if (null != this.artista) {
			_return = _return.concat(" artista: ").concat(this.artista.getNome());
		}
		return _return.concat("\n");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musicas other = (Musicas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
