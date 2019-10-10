package com.cg.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.entity.Album;
import com.cg.entity.Artist;
import com.cg.service.ArtistAlbumService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:appctx.xml")
public class ArtistAlbumTest {
	
	@Autowired
	private ArtistAlbumService service;
	
	@Test
	public void testFetchArtist() {
		Artist  ar = service.fetchArtist(456);
		System.out.println(ar.getName());
	}
	
	@Test
	public void testAddAlbum() {
		Album al = new Album();
		al.setAlbum_id(1004);
		al.setPrice(555.5);
		al.setTitle("Love");
		
		
	  Artist ar = new Artist(); ar.setArtist_id(789); ar.setGenre("Rock");
		 ar.setName("Freddy Mercury");
//		 
	//	Artist  ar =(Artist) service.fetchArtist(456);
	   al.setArtist(ar);
		
		service.addAlbum(al);
		
	}
	
	@Test
	public void testSaveArtist() {
		Artist ar = new Artist();
		ar.setArtist_id(001);
		ar.setGenre("classic");
		ar.setName("Freddy Mercury");
		Set<Album> albums = new HashSet<Album>();
		
		Album al1 = new Album();
		al1.setAlbum_id(2000);
		al1.setPrice(555.5);
		al1.setTitle("Queen");
		
		
	  
//		 
	//	Artist  ar =(Artist) service.fetchArtist(456);
//	   al1.setArtist(ar);
		albums.add(al1);
		
		Album al2 = new Album();
		al2.setAlbum_id(2001);
		al2.setPrice(555.5);
		al2.setTitle("Innuendo");
		albums.add(al2);
		
		ar.setAlbums(albums);
		
		service.addArtist(ar);
		
	}
	
	@Test
	public void testListAlbum() {
		List<Album> albums =  service.getAlbumList();
		for(Album al:albums)
			System.out.println(al.getTitle());
	}

}
