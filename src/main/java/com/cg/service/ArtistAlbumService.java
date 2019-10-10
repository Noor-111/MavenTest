package com.cg.service;

import java.util.List;

import com.cg.entity.Album;
import com.cg.entity.Artist;

public interface ArtistAlbumService {
	
	public void addAlbum(Album album);
	
	Artist fetchArtist(int artist_id);
	
	public void addArtist(Artist artist);
	
	List<Album> getAlbumList();

}
