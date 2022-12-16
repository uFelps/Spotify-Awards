package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.AlbumDTO;
import com.felps.Spotify.Awards.dto.ScoreAlbumDTO;
import com.felps.Spotify.Awards.entities.Album;
import com.felps.Spotify.Awards.entities.ScoreAlbum;
import com.felps.Spotify.Awards.entities.User;
import com.felps.Spotify.Awards.repositories.AlbumRepository;
import com.felps.Spotify.Awards.repositories.ScoreAlbumRepository;
import com.felps.Spotify.Awards.repositories.UserRepository;

@Service
public class ScoreAlbumService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private ScoreAlbumRepository scoreAlbumRepository;

	@Transactional
	public AlbumDTO saveScore(ScoreAlbumDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User(null, dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Album album = albumRepository.findById(dto.getAlbumId()).get();
		
		
		ScoreAlbum score = new ScoreAlbum(user, album, dto.getScore());
		score = scoreAlbumRepository.saveAndFlush(score);
		
		
		double sum = 0.0;
		
		for(ScoreAlbum s : album.getScoresAlbum()) {
			sum += s.getScoreValue();
		}
		
		double avg = sum / album.getScoresAlbum().size();
		
		album.setAverage(avg);
		album.setCountVotes(album.getScoresAlbum().size());
		album = albumRepository.saveAndFlush(album);
		
		
		return new AlbumDTO(album);
	}
	
}
