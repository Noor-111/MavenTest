package com.cg.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.Album;
import com.cg.entity.Artist;

@Repository
public class ArtistAlbumRepoImpl implements ArtistAlbumRepo {
	
	@PersistenceContext(name="MyJPA")
	
	private EntityManager mgr;

	public void save(Album album) {
		mgr.persist(album);
		
		
	}

	public Artist fetch(int id) {
		Artist a1 = (Artist)mgr.find(Artist.class, id);
		
		return a1;
	}

	public void saveArtist(Artist artist) {
		mgr.persist(artist);
	}

	public List<Album> list() {
		
		return mgr.createQuery("from Album").getResultList();
	
	}

}
