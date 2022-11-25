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
		Song asIsWas = new Song(null, "As is Was", "Harry Styles", "2:37", "Pop", true, false, "https://open.spotify.com/track/4LRPiXqCikLlN15c3yImP7?si=8405e2769bfa4d9a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/As-It-Was.png?raw=true", 0.0, 0, null);
		Song antiHero = new Song(null, "Anti-Hero", "Taylor Swift", "3:20", "Pop", true, false, "https://open.spotify.com/track/0V3wPSX9ygBnCm8psDIegu?si=a215a95cb3404e20", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/anti-hero.png?raw=true", 0.0, 0, null);
		Song n95 = new Song(null, "N95", "Kendrick Lamar", "3:52", "Hip-Hop", true, false, "https://open.spotify.com/track/0fX4oNGBWO3dSGUZcVdVV2?si=015798ae3c7e4dc3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/n95.png?raw=true", 0.0, 0, null);
		Song ilikeyou = new Song(null, "I Like You", "Post Malone, Doja Cat", "3:52", "Pop", true, false, "https://open.spotify.com/track/0O6u0VJ46W86TxN9wgyqDj?si=cbf08479c29e488a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/I-Like-You.jpg.png?raw=true", 0.0, 0, null);
		Song blackSummer = new Song(null, "Black Summer", "Red Hot Chili Peppers", "3:52", "Rock", true, false, "https://open.spotify.com/track/3a94TbZOxhkI9xuNwYL53b?si=0d58ac9f99164ce3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/black-summer.jpg.png?raw=true", 0.0, 0, unlimitedLove);
		Song missYou = new Song(null, "Miss You", "Oliver Tree", "3:26", "Pop", true, false, "https://open.spotify.com/track/73vIOb4Q7YN6HeJTbscRx5?si=7c58689be9c14ecf", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/missyou.jpg.png?raw=true", 0.0, 0, null);
		songRepository.saveAll(Arrays.asList(asIsWas, antiHero, n95, ilikeyou, blackSummer, missYou));
		
		/*best pop*/
		Song unroly = new Song(null, "Unholy", "Sam Smith, Kim Petras", "2:36", "Pop", false, true, "https://open.spotify.com/track/3nqQXoyQOWXiESFLlDF1hG?si=023b3f1087dc441c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/unholy.jpg.png?raw=true", 0.0, 0, null);
		Song breakMySoul = new Song(null, "Break My Soul", "Beyoncé", "4:38", "Pop", false, true, "https://open.spotify.com/track/2KukL7UlQ8TdvpaA7bY3ZJ?si=28d00316fcab437c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/breakmysoul.jpeg.png?raw=true", 0.0, 0, null);
		Song late = new Song(null, "Late Night Talking", "Harry Styles", "2:57", "Pop", false, true, "https://open.spotify.com/track/1qEmFfgcLObUfQm0j1W2CK?si=b9920c0c6ad24468", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/lateNightTalking.png?raw=true", 0.0, 0, null);
		Song lavender = new Song(null, "Lavender Haze", "Taylor Swift", "3:22", "Pop", false, true, "https://open.spotify.com/track/5jQI2r1RdgtuT8S3iG8zFC?si=b23c047e38f54e14", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/lavander.jpg.png?raw=true", 0.0, 0, null);
		Song dynamite = new Song(null, "Dynamite", "BTS", "3:19", "Pop", false, true, "https://open.spotify.com/track/1hIuSG6xV4RDgD8bDVKP7N?si=d828241883a94b86", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/dynamite.jpg.png?raw=true", 0.0, 0, null);
		Song butter = new Song(null, "Butter", "BTS", "2:44", "Pop", false, true, "https://open.spotify.com/track/6jjYDGxVJsWS0a5wlVF5vS?si=707e9852b10b4ba3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/butter.png?raw=true", 0.0, 0, null);
		
		songRepository.saveAll(Arrays.asList(dynamite,unroly, breakMySoul, late, lavender,butter));
		
		
		/*best hip hop*/
		Song dieHard = new Song(null, "Die Hard", "Kendrick Lamar", "3:59", "Hip-Hop", false, true, "https://open.spotify.com/track/2g6tReTlM2Akp41g0HaeXN?si=d6cb3d5642ff4236", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/diehard.png?raw=true", 0.0, 0, null);
		Song jimmy = new Song(null, "Jimmy Cooks", "Drake, 21 Savage", "3:38", "Hip-Hop", false, true, "https://open.spotify.com/track/3F5CgOj3wFlRv51JsHbxhe?si=308b31923d224861", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/jimmy.png?raw=true", 0.0, 0, null);
		Song cooped = new Song(null, "Cooped Up", "Post Malone, Roddy Ricch", "3:05", "Hip-Hop", false, true, "https://open.spotify.com/track/7DwcBgdzqhFJltEaV1XF81?si=58e6287474444f8b", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/cooppedup.png?raw=true", 0.0, 0, null);
		Song family = new Song(null, "Family Ties", "Baby Keem, Kendrick Lamar", "4:12", "Hip-Hop", false, true, "https://open.spotify.com/track/7Bpx2vsWfQFBACRz4h3IqH?si=b302e13019334ac9", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/familyties.png?raw=true", 0.0, 0, null);
		Song rich = new Song(null, "Rich Flex", "Drake, 21 Savage", "3:59", "Hip-Hop", false, true, "https://open.spotify.com/track/1bDbXMyjaUIooNwFE9wn0N?si=5aad3c9693bf4947", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/richflex.png?raw=true", 0.0, 0, null);
		Song island = new Song(null, "Island of Da Phonk Up", "psycho7k", "1:49", "Hip-Hop", false, true, "https://open.spotify.com/track/2rHlvvsXY72TC8N71XZxkn?si=304e690b02484d6f", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/island.png?raw=true", 0.0, 0, null);
		
		songRepository.saveAll(Arrays.asList(island,dieHard, jimmy, cooped, family, rich ));
		
		/*best rock*/
		Song tippa = new Song(null, "Tippa My Tongue", "Red Hot Chili Peppers", "4:20", "Rock", false, true, "https://open.spotify.com/track/3s53zBEi1ZU6dJj19eFOxW?si=316e19c326004699", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/tippamytoungue.png?raw=true", 0.0, 0, null);
		Song thisIsWay = new Song(null, "This is Why", "Paramore", "3:27", "Rock", false, true, "https://open.spotify.com/track/7z84Fwf1R3Z2BwHCP620CI?si=460092134e524df7", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thisisway.png?raw=true", 0.0, 0, null);
		Song body = new Song(null, "Body Paint", "Arctic Monkeys", "4:50", "Rock", false, true, "https://open.spotify.com/track/42GuKw49pPxNAkIhWGwgFs?si=4632d7295b214dfa", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/bodypaint.png?raw=true", 0.0, 0, null);
		Song dying = new Song(null, "The Dying Song", "Slipknot", "3:23", "Rock", false, true, "https://open.spotify.com/track/6rsoBvxrlxdmqJyGPPciyq?si=9f247f6b390f4d20", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thedyingsong.png?raw=true", 0.0, 0, null);
		Song patient = new Song(null, "Patient Number 9", "Ozzy Osbourne, Jeff Beck", "7:21", "Rock", false, true, "https://open.spotify.com/track/3YYnFEXCLNbaWuC0hIEnIS?si=01575c29fe6a471c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/ozzy-patient-number-9.png?raw=true", 0.0, 0, null);
		Song these = new Song(null, "These Are The Ways", "Red Hot Chili Peppers", "3:56", "Rock", false, true, "https://open.spotify.com/track/1KtXgVTeu3GUXHrOAef6QQ?si=8086e17dbf854aa9", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thesearetheways.png?raw=true", 0.0, 0, null);
		
		songRepository.saveAll(Arrays.asList(tippa, thisIsWay, body, dying, patient, these));


		
	}

}
