package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

//@SequenceGenerator(name = "bseq", sequenceName = "alb_seq")
public class Album {
	
	@Id
	@Column(name="album_id")
	private int album_id;
	
	
	@Column(name = "title", length = 20)
	private String title;
	
	@Column(name = "price")
	private double price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="artist_id")
	private Artist artist;
	
	// getters Setters

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	
	

}
