package com.cg.repo;

import java.util.List;

import com.cg.entity.Album;
import com.cg.entity.Artist;

public interface ArtistAlbumRepo {
	
	void save(Album album);
	Artist fetch(int id);
	void saveArtist(Artist artist);
	List<Album> list();

}
