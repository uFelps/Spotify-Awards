package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.AlbumDTO;
import com.felps.Spotify.Awards.dto.AlbumSimpleDTO;
import com.felps.Spotify.Awards.services.AlbumService;

@RestController
@RequestMapping(value = "/albuns")
public class AlbumResource {

	@Autowired
	private AlbumService service;
	
	@GetMapping
	public Page<AlbumSimpleDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public AlbumDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
