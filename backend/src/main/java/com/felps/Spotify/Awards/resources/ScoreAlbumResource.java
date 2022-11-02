package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.AlbumDTO;
import com.felps.Spotify.Awards.dto.ScoreAlbumDTO;
import com.felps.Spotify.Awards.services.ScoreAlbumService;

@RestController
@RequestMapping("/scoreAlbum")
public class ScoreAlbumResource {
	
	@Autowired
	private ScoreAlbumService service;
	
	@PutMapping
	public AlbumDTO saveScore(@RequestBody ScoreAlbumDTO dto) {
		return service.saveScore(dto);
	}

}
