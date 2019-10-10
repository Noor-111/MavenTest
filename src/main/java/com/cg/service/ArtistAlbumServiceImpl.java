package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Album;
import com.cg.entity.Artist;
import com.cg.repo.ArtistAlbumRepo;


@Service
@Transactional
public class ArtistAlbumServiceImpl implements ArtistAlbumService {

	@Autowired
	private ArtistAlbumRepo repo;
	
	
	public void addAlbum(Album album) {
		repo.save(album);
		
		
	}

	public Artist fetchArtist(int artist_id) {
		return (Artist)repo.fetch(artist_id);
	}

	public void addArtist(Artist artist) {
		repo.saveArtist(artist);
		
	}

	public List<Album> getAlbumList() {
		
		return repo.list();
	}

}
