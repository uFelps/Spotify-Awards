package com.felps.Spotify.Awards.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felps.Spotify.Awards.dto.ScoreSongDTO;
import com.felps.Spotify.Awards.dto.SongDTO;
import com.felps.Spotify.Awards.services.ScoreSongService;

@RestController
@RequestMapping(value = "/scoreSong")
public class ScoreSongResource {

	@Autowired
	private ScoreSongService service;
	
	@PutMapping
	public SongDTO saveScore(@RequestBody ScoreSongDTO dto) {
		return service.saveScore(dto);
	}
}
