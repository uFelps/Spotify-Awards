package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.ArtistDTO;
import com.felps.Spotify.Awards.services.ArtistService;

@RestController
@RequestMapping(value = "/artists")
public class ArtistResource {

	@Autowired
	private ArtistService service;
	
	@GetMapping
	public Page<ArtistDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ArtistDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
