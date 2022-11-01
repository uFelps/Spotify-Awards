package com.felps.Spotify.Awards.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.ArtistDTO;
import com.felps.Spotify.Awards.entities.Artist;
import com.felps.Spotify.Awards.repositories.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository repository;

	@Transactional(readOnly = true)
	public Page<ArtistDTO> findAll(Pageable pageable) {

		Page<Artist> artists = repository.findAll(pageable);
		
		Page<ArtistDTO> artistsDTO = artists.map(x -> new ArtistDTO(x));
		
		return artistsDTO;

	}

}
