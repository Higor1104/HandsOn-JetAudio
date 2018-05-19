package com.handson.sqllite.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.google.common.collect.Lists;

@Entity
public class Playlists {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Musicas> musicas = Lists.newArrayList();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		String _return = new String().concat("id:").concat(this.id);
		if (!this.musicas.isEmpty()) {
			_return = _return.concat(" qtd musicas: ").concat(String.valueOf(this.musicas.size()));
		}
		return _return.concat("\n");
	}

}
