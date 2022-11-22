package com.felps.Spotify.Awards.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felps.Spotify.Awards.entities.Album;
import com.felps.Spotify.Awards.entities.Artist;
import com.felps.Spotify.Awards.entities.ScoreAlbum;
import com.felps.Spotify.Awards.entities.ScoreArtist;
import com.felps.Spotify.Awards.entities.ScoreSong;
import com.felps.Spotify.Awards.entities.Song;
import com.felps.Spotify.Awards.entities.User;
import com.felps.Spotify.Awards.repositories.AlbumRespository;
import com.felps.Spotify.Awards.repositories.ArtistRepository;
import com.felps.Spotify.Awards.repositories.ScoreAlbumRepository;
import com.felps.Spotify.Awards.repositories.ScoreArtistRepository;
import com.felps.Spotify.Awards.repositories.ScoreSongRepository;
import com.felps.Spotify.Awards.repositories.SongRepository;
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
	
	@Autowired
	private AlbumRespository albumRespository;
	
	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private ScoreAlbumRepository scoreAlbumRepository;
	
	@Autowired
	private ScoreSongRepository scoreSongRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User maria = new User(null, "maria@gmail.com"); 
		User alex = new User(null, "alex@gmail.com");
		User joao = new User(null, "joao@gmail.com"); 
		User ana = new User(null, "ana@gmail.com");
		User lucas = new User(null, "lucas@gmail.com"); 
		User joaquim = new User(null, "joaquim@gmail.com");
		userRepository.saveAll(Arrays.asList(maria, alex, joao, ana, lucas, joaquim));
		
		
		Artist harry = new Artist(null, "Harry Styles", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/harry.jpeg.png?raw=true" , "63.961.408", 0.0, 0);
		Artist kendrick = new Artist(null, "Kendrick Lamar", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/kendrick-lamar.jpg.png?raw=true", "37.552.617", 0.0, 0);
		Artist post = new Artist(null, "Post Malone", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/post-malone.jpg.png?raw=true", "50.243.221", 0.0, 0);
		Artist doja = new Artist(null, "Doja Cat", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/doja-cat.jpeg.png?raw=true" , "50.332.358", 0.0, 0);
		Artist billie = new Artist(null, "Billie Eilish", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/billie.jpg.png?raw=true" , "50.361.697", 0.0, 0);
		Artist taylor = new Artist(null, "Taylor Swift", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/taylor-swif.jpg.png?raw=true" , "83.546.017", 0.0, 0);
		
		artistRepository.saveAll(Arrays.asList(harry, kendrick, post, doja, billie, taylor));
		
		
		/*ScoreArtist sa1 = new ScoreArtist(rhcp, maria, 4.0);		
		ScoreArtist sa2 = new ScoreArtist(rhcp, alex, 5.0);
		ScoreArtist sa3 = new ScoreArtist(kendrick, joao, 5.0);
		ScoreArtist sa4 = new ScoreArtist(kendrick, ana, 5.0);
		ScoreArtist sa5 = new ScoreArtist(kendrick, lucas, 5.0);
		scoreArtistRepository.saveAll(Arrays.asList(sa1, sa2, sa3, sa4, sa5));*/
		
		
		
		
		
		Album unlimitedLove = new Album(null, "Unlimited Love", "Red Hot Chili Peppers", "1h 13m", Instant.parse("2022-04-01T00:00:00Z"), null, null, 5.0, 2);
		albumRespository.save(unlimitedLove);
		
		
		
		/*ScoreAlbum sd1 = new ScoreAlbum(maria, unlimitedLove, 5.0);
		ScoreAlbum sd2 = new ScoreAlbum(alex, unlimitedLove, 5.0);
		scoreAlbumRepository.saveAll(Arrays.asList(sd1, sd2));
		
		ScoreSong sg1 = new ScoreSong(maria, blackSummer, 5.0);
		ScoreSong sg2 = new ScoreSong(maria, whatchuthinkin, 5.0);
		ScoreSong sg3 = new ScoreSong(alex, blackSummer, 5.0);
		ScoreSong sg4 = new ScoreSong(alex, whatchuthinkin, 5.0);
		scoreSongRepository.saveAll(Arrays.asList(sg1,sg2,sg3,sg4));*/
		
		/*songs of the year*/
		Song asIsWas = new Song(null, "As is Was", "Harry Styles", "2:37", "Pop", true, true, "https://open.spotify.com/track/4LRPiXqCikLlN15c3yImP7?si=8405e2769bfa4d9a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/As-It-Was.png?raw=true", 0.0, 0, null);
		Song antiHero = new Song(null, "Anti-Hero", "Taylor Swift", "3:20", "Pop", true, true, "https://open.spotify.com/track/0V3wPSX9ygBnCm8psDIegu?si=a215a95cb3404e20", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/anti-hero.png?raw=true", 0.0, 0, null);
		Song n95 = new Song(null, "N95", "Kendrick Lamar", "3:52", "Hip-Hop", true, true, "https://open.spotify.com/track/0fX4oNGBWO3dSGUZcVdVV2?si=015798ae3c7e4dc3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/n95.png?raw=true", 0.0, 0, null);
		Song ilikeyou = new Song(null, "I Like You", "Post Malone, Doja Cat", "3:52", "Pop", true, true, "https://open.spotify.com/track/0O6u0VJ46W86TxN9wgyqDj?si=cbf08479c29e488a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/I-Like-You.jpg.png?raw=true", 0.0, 0, null);
		Song blackSummer = new Song(null, "Black Summer", "Red Hot Chili Peppers", "3:52", "Rock", true, false, "https://open.spotify.com/track/3a94TbZOxhkI9xuNwYL53b?si=0d58ac9f99164ce3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/black-summer.jpg.png?raw=true", 0.0, 0, unlimitedLove);
		Song missYou = new Song(null, "Miss You", "Oliver Tree", "3:26", "Pop", true, false, "https://open.spotify.com/track/73vIOb4Q7YN6HeJTbscRx5?si=7c58689be9c14ecf", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/missyou.jpg.png?raw=true", 0.0, 0, null);
		
		songRepository.saveAll(Arrays.asList(asIsWas, antiHero, n95, ilikeyou, blackSummer, missYou));

		
		Song whatchuthinkin = new Song(null, "Whatchu Thinkin'", "Red Hot Chili Peppers", "3:40", "Rock", false, true, null, null, 5.0, 2, unlimitedLove);
		
		

		
		
		
	}

}
