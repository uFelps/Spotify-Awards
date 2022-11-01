package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.ArtistDTO;
import com.felps.Spotify.Awards.dto.ScoreArtistDTO;
import com.felps.Spotify.Awards.services.ScoreArtistService;

@RestController
@RequestMapping("/artistScore")
public class ScoreArtistResource {

	@Autowired
	private ScoreArtistService service;
	
	@PutMapping
	public ArtistDTO saveScoreArtist(@RequestBody ScoreArtistDTO dto) {
		ArtistDTO artistDTO = service.saveScoreArtist(dto);
		
		return artistDTO;
	}
}
