package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.SongDTO;
import com.felps.Spotify.Awards.services.SongService;

@RestController
@RequestMapping(value = "/best-pop")
public class BestPopResource {

	@Autowired
	private SongService service;
	
	@GetMapping
	public Page<SongDTO> findAll(Pageable pageable){
		return service.findByCategory("Pop",pageable);
	}
}
