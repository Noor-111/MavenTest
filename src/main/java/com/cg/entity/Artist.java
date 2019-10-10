package com.cg.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="artist")

public class Artist {
	
	
	@Id
	@Column(name="artist_id")
	private int artist_id;
	
	@Column(name="name", length = 20)
	private String name;
	
	@Column(name="genre", length = 10)
	private String genre;
	
	
	@OneToMany(mappedBy = "artist",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<Album> albums = new HashSet<Album>();


	//getters setters
	public int getArtist_id() {
		return artist_id;
	}


	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public Set<Album> getAlbums() {
		return albums;
	}


	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	
	
	
	

}
