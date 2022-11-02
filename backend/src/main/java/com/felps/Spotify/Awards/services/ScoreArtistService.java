package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.ArtistDTO;
import com.felps.Spotify.Awards.dto.ScoreArtistDTO;
import com.felps.Spotify.Awards.entities.Artist;
import com.felps.Spotify.Awards.entities.ScoreArtist;
import com.felps.Spotify.Awards.entities.User;
import com.felps.Spotify.Awards.repositories.ArtistRepository;
import com.felps.Spotify.Awards.repositories.ScoreArtistRepository;
import com.felps.Spotify.Awards.repositories.UserRepository;

@Service
public class ScoreArtistService {

	@Autowired
	private ScoreArtistRepository scoreArtistrepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ArtistRepository artistRepository;

	@Transactional
	public ArtistDTO saveScoreArtist(ScoreArtistDTO dto) {

		User user = userRepository.findByEmail(dto.getEmail());

		if (user == null) {
			user = new User(null, dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Artist artist = artistRepository.findById(dto.getArtistId()).get();

		ScoreArtist score = new ScoreArtist(artist, user, dto.getScore());
		score = scoreArtistrepository.saveAndFlush(score);

		double sum = 0.0;

		for (ScoreArtist s : artist.getScoresArtist()) {
			sum += s.getScoreValue();
		}

		double avg = sum / artist.getScoresArtist().size();

		artist.setAverage(avg);
		artist.setCountVotes(artist.getScoresArtist().size());

		artist = artistRepository.saveAndFlush(artist);

		return new ArtistDTO(artist);

	}

}
