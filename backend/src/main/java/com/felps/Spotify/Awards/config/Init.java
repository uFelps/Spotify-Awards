package com.felps.Spotify.Awards.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felps.Spotify.Awards.entities.Artist;
import com.felps.Spotify.Awards.entities.ScoreArtist;
import com.felps.Spotify.Awards.entities.User;
import com.felps.Spotify.Awards.repositories.ArtistRepository;
import com.felps.Spotify.Awards.repositories.ScoreArtistRepository;
import com.felps.Spotify.Awards.repositories.UserRepository;

@Configuration
@Profile("test")
public class Init implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private ScoreArtistRepository scoreArtistRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User maria = new User(null, "maria@gmail.com"); 
		User alex = new User(null, "alex@gmail.com");
		User joao = new User(null, "joao@gmail.com"); 
		User ana = new User(null, "ana@gmail.com");
		User lucas = new User(null, "lucas@gmail.com"); 
		User joaquim = new User(null, "joaquim@gmail.com");
		userRepository.saveAll(Arrays.asList(maria, alex, joao, ana, lucas, joaquim));
		
		
		Artist rhcp = new Artist(null, "Red Hot Chili Peppers", null, "26.298.433", 4.5, 2);
		Artist kendrick = new Artist(null, "Kendrick Lamar",null, "37.552.617", 5.0, 3);
		artistRepository.saveAll(Arrays.asList(rhcp, kendrick));
		
		
		ScoreArtist sa1 = new ScoreArtist(rhcp, maria, 4.0);		
		ScoreArtist sa2 = new ScoreArtist(rhcp, alex, 5.0);
		ScoreArtist sa3 = new ScoreArtist(kendrick, joao, 5.0);
		ScoreArtist sa4 = new ScoreArtist(kendrick, ana, 5.0);
		ScoreArtist sa5 = new ScoreArtist(kendrick, lucas, 5.0);
		
		
		scoreArtistRepository.saveAll(Arrays.asList(sa1, sa2, sa3, sa4, sa5));
		
	}

}
