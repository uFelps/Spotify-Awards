package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.ScoreSongDTO;
import com.felps.Spotify.Awards.dto.SongDTO;
import com.felps.Spotify.Awards.entities.ScoreSong;
import com.felps.Spotify.Awards.entities.Song;
import com.felps.Spotify.Awards.entities.User;
import com.felps.Spotify.Awards.repositories.ScoreSongRepository;
import com.felps.Spotify.Awards.repositories.SongRepository;
import com.felps.Spotify.Awards.repositories.UserRepository;

@Service
public class ScoreSongService {

	@Autowired
	private ScoreSongRepository scoreSongRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	
	@Transactional
	public SongDTO saveScore(ScoreSongDTO dto) {		
		
		User user = userRepository.findByEmail(dto.getEmail());

		if (user == null) {
			user = new User(null, dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Song song = songRepository.findById(dto.getSongId()).get();

		ScoreSong score = new ScoreSong(user, song, dto.getScore());
		score = scoreSongRepository.saveAndFlush(score);

		double sum = 0.0;

		for (ScoreSong s : song.getScores()) {
			sum += s.getScore();
		}

		double avg = sum / song.getScores().size();

		song.setAverage(avg);
		song.setCountVotes(song.getScores().size());

		song = songRepository.saveAndFlush(song);

		return new SongDTO(song);

	}
	
	
}
