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
		
		
		
		
		
		
		
		
		
		/*ScoreAlbum sd1 = new ScoreAlbum(maria, unlimitedLove, 5.0);
		ScoreAlbum sd2 = new ScoreAlbum(alex, unlimitedLove, 5.0);
		scoreAlbumRepository.saveAll(Arrays.asList(sd1, sd2));
		
		ScoreSong sg1 = new ScoreSong(maria, blackSummer, 5.0);
		ScoreSong sg2 = new ScoreSong(maria, whatchuthinkin, 5.0);
		ScoreSong sg3 = new ScoreSong(alex, blackSummer, 5.0);
		ScoreSong sg4 = new ScoreSong(alex, whatchuthinkin, 5.0);
		scoreSongRepository.saveAll(Arrays.asList(sg1,sg2,sg3,sg4));*/
		
		/*songs of the year*/
		Song asIsWas = new Song(null, "As is Was", "Harry Styles", "2:37", "Pop", true, false, "https://open.spotify.com/track/4LRPiXqCikLlN15c3yImP7?si=8405e2769bfa4d9a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/As-It-Was.png?raw=true", 0.0, 0);
		Song antiHero = new Song(null, "Anti-Hero", "Taylor Swift", "3:20", "Pop", true, false, "https://open.spotify.com/track/0V3wPSX9ygBnCm8psDIegu?si=a215a95cb3404e20", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/anti-hero.png?raw=true", 0.0, 0);
		Song n95 = new Song(null, "N95", "Kendrick Lamar", "3:52", "Hip-Hop", true, false, "https://open.spotify.com/track/0fX4oNGBWO3dSGUZcVdVV2?si=015798ae3c7e4dc3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/n95.png?raw=true", 0.0, 0);
		Song ilikeyou = new Song(null, "I Like You", "Post Malone, Doja Cat", "3:52", "Pop", true, false, "https://open.spotify.com/track/0O6u0VJ46W86TxN9wgyqDj?si=cbf08479c29e488a", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/I-Like-You.jpg.png?raw=true", 0.0, 0);
		Song blackSummer = new Song(null, "Black Summer", "Red Hot Chili Peppers", "3:52", "Rock", true, false, "https://open.spotify.com/track/3a94TbZOxhkI9xuNwYL53b?si=0d58ac9f99164ce3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/black-summer.jpg.png?raw=true", 0.0, 0);
		Song missYou = new Song(null, "Miss You", "Oliver Tree", "3:26", "Pop", true, false, "https://open.spotify.com/track/73vIOb4Q7YN6HeJTbscRx5?si=7c58689be9c14ecf", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/missyou.jpg.png?raw=true", 0.0, 0);
		songRepository.saveAll(Arrays.asList(asIsWas, antiHero, n95, ilikeyou, blackSummer, missYou));
		
		/*best pop*/
		Song unroly = new Song(null, "Unholy", "Sam Smith, Kim Petras", "2:36", "Pop", false, true, "https://open.spotify.com/track/3nqQXoyQOWXiESFLlDF1hG?si=023b3f1087dc441c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/unholy.jpg.png?raw=true", 0.0, 0);
		Song breakMySoul = new Song(null, "Break My Soul", "Beyoncé", "4:38", "Pop", false, true, "https://open.spotify.com/track/2KukL7UlQ8TdvpaA7bY3ZJ?si=28d00316fcab437c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/breakmysoul.jpeg.png?raw=true", 0.0, 0);
		Song late = new Song(null, "Late Night Talking", "Harry Styles", "2:57", "Pop", false, true, "https://open.spotify.com/track/1qEmFfgcLObUfQm0j1W2CK?si=b9920c0c6ad24468", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/lateNightTalking.png?raw=true", 0.0, 0);
		Song lavender = new Song(null, "Lavender Haze", "Taylor Swift", "3:22", "Pop", false, true, "https://open.spotify.com/track/5jQI2r1RdgtuT8S3iG8zFC?si=b23c047e38f54e14", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/lavander.jpg.png?raw=true", 0.0, 0);
		Song dynamite = new Song(null, "Dynamite", "BTS", "3:19", "Pop", false, true, "https://open.spotify.com/track/1hIuSG6xV4RDgD8bDVKP7N?si=d828241883a94b86", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/dynamite.jpg.png?raw=true", 0.0, 0);
		Song butter = new Song(null, "Butter", "BTS", "2:44", "Pop", false, true, "https://open.spotify.com/track/6jjYDGxVJsWS0a5wlVF5vS?si=707e9852b10b4ba3", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/butter.png?raw=true", 0.0, 0);
		
		songRepository.saveAll(Arrays.asList(dynamite,unroly, breakMySoul, late, lavender,butter));
		
		
		/*best hip hop*/
		Song dieHard = new Song(null, "Die Hard", "Kendrick Lamar", "3:59", "Hip-Hop", false, true, "https://open.spotify.com/track/2g6tReTlM2Akp41g0HaeXN?si=d6cb3d5642ff4236", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/diehard.png?raw=true", 0.0, 0);
		Song jimmy = new Song(null, "Jimmy Cooks", "Drake, 21 Savage", "3:38", "Hip-Hop", false, true, "https://open.spotify.com/track/3F5CgOj3wFlRv51JsHbxhe?si=308b31923d224861", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/jimmy.png?raw=true", 0.0, 0);
		Song cooped = new Song(null, "Cooped Up", "Post Malone, Roddy Ricch", "3:05", "Hip-Hop", false, true, "https://open.spotify.com/track/7DwcBgdzqhFJltEaV1XF81?si=58e6287474444f8b", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/cooppedup.png?raw=true", 0.0, 0);
		Song family = new Song(null, "Family Ties", "Baby Keem, Kendrick Lamar", "4:12", "Hip-Hop", false, true, "https://open.spotify.com/track/7Bpx2vsWfQFBACRz4h3IqH?si=b302e13019334ac9", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/familyties.png?raw=true", 0.0, 0);
		Song rich = new Song(null, "Rich Flex", "Drake, 21 Savage", "3:59", "Hip-Hop", false, true, "https://open.spotify.com/track/1bDbXMyjaUIooNwFE9wn0N?si=5aad3c9693bf4947", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/richflex.png?raw=true", 0.0, 0);
		Song island = new Song(null, "Island of Da Phonk Up", "psycho7k", "1:49", "Hip-Hop", false, true, "https://open.spotify.com/track/2rHlvvsXY72TC8N71XZxkn?si=304e690b02484d6f", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/island.png?raw=true", 0.0, 0);
		
		songRepository.saveAll(Arrays.asList(island,dieHard, jimmy, cooped, family, rich ));
		
		/*best rock*/
		Song tippa = new Song(null, "Tippa My Tongue", "Red Hot Chili Peppers", "4:20", "Rock", false, true, "https://open.spotify.com/track/3s53zBEi1ZU6dJj19eFOxW?si=316e19c326004699", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/tippamytoungue.png?raw=true", 0.0, 0);
		Song thisIsWay = new Song(null, "This is Why", "Paramore", "3:27", "Rock", false, true, "https://open.spotify.com/track/7z84Fwf1R3Z2BwHCP620CI?si=460092134e524df7", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thisisway.png?raw=true", 0.0, 0);
		Song body = new Song(null, "Body Paint", "Arctic Monkeys", "4:50", "Rock", false, true, "https://open.spotify.com/track/42GuKw49pPxNAkIhWGwgFs?si=4632d7295b214dfa", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/bodypaint.png?raw=true", 0.0, 0);
		Song dying = new Song(null, "The Dying Song", "Slipknot", "3:23", "Rock", false, true, "https://open.spotify.com/track/6rsoBvxrlxdmqJyGPPciyq?si=9f247f6b390f4d20", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thedyingsong.png?raw=true", 0.0, 0);
		Song patient = new Song(null, "Patient Number 9", "Ozzy Osbourne, Jeff Beck", "7:21", "Rock", false, true, "https://open.spotify.com/track/3YYnFEXCLNbaWuC0hIEnIS?si=01575c29fe6a471c", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/ozzy-patient-number-9.png?raw=true", 0.0, 0);
		Song these = new Song(null, "These Are The Ways", "Red Hot Chili Peppers", "3:56", "Rock", false, true, "https://open.spotify.com/track/1KtXgVTeu3GUXHrOAef6QQ?si=8086e17dbf854aa9", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thesearetheways.png?raw=true", 0.0, 0);
		
		songRepository.saveAll(Arrays.asList(tippa, thisIsWay, body, dying, patient, these));
		
		
		/*albuns of the year*/
		Album unlimitedLove = new Album(null, "Unlimited Love", "Red Hot Chili Peppers", "1h 13m", Instant.parse("2022-04-01T00:00:00Z"), "https://open.spotify.com/album/2ITVvrNiINKRiW7wA3w6w6?si=8-gc2h3iSB2sVeXLdtWnHA", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/unlimited-love.jpg?raw=true", 0.0, 0);
		
		unlimitedLove.getSongs().addAll(Arrays.asList(
				"Black Summer,3:52",
				"Here Ever After,3:50",
				"Aquatic Mouth Dance,4:20",
				"Not the One,4:26",
				"Poster Child,5:18",
				"The Great Apes,5:01",
				"It's Only Natural,5:33",
				"She's a Lover,3:41",
				"These Are the Ways,3:56",
				"Watchu Thinkin',3:40",
				"Bastards of Light, 3:38",
				"White Braids & Pillow Chair,3:40",
				"One Way Traffic,4:10",
				"Veronica,4:28",
				"Let 'Em Cry,4:23",
				"The Heavy Wing,5:31",
				"Tangelo,3:37"
				));
		albumRespository.save(unlimitedLove);
		
		Album harrysHouse = new Album(null, "Harry's House", "Harry Styles", "41min 59s", Instant.parse("2022-05-20T00:00:00Z"), "https://open.spotify.com/album/5r36AJ6VOJtp00oxSkBZ5h?si=EzDz8oGXSoikcWUh9zDPdw", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/harrys-house.png?raw=true", 0.0, 0);
		
		harrysHouse.getSongs().addAll(Arrays.asList(
				"Music For A Sushi Restaurant,03:02",
				"Late Night Talking,03:08",
				"Grapejuice,03:12",
				"As It Was,02:47",
				"Daylight,02:45",
				"Little Freak,03:20",
				"Matilda,04:05",
				"Cinema,04:03",
				"Daydreaming,03:07",
				"Keep Driving,02:19",
				"Satellite,03:37",
				"Boyfriends,03:12",
				"Love Of My Life,03:11"
				));
		albumRespository.save(harrysHouse);
		
		
		Album proof = new Album(null, "Proof", "BTS", "2h 8m", Instant.parse("2022-06-10T00:00:00Z"), "https://open.spotify.com/album/6al2VdKbb6FIz9d7lU7WRB?si=b06bc616f6d14ed7", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/proof.jpg?raw=true", 0.0, 0);
		
		proof.getSongs().addAll(Arrays.asList(
				"Born Singer,3:58",
				"No More Dream,3:42",
				"N.O,3:29",
				"Boy in Luv,3:51",
				"Danger,4:05",
				"I NEED U,3:30",
				"RUN,3:56",
				"FIRE,3:23",
				"Blood Sweat & Tears,3:37",
				"Spring Day,4:34",
				"DNA,3:43",
				"FAKE LOVE,4:02",
				"IDOL,3:42",
				"Boy With Luv (Feat. Halsey),3:49",
				"ON,4:06",
				"Dynamite,3:19",
				"Life Goes On,3:28",
				"Butter,2:44",
				"Yet To Come,3:13",
				"Run BTS,3:24",
				"Intro: Persona,2:51",
				"Stay,3:26",
				"Moon,3:28",
				"Jamais Vu,3:47",
				"BTS Cypher PT.3: KILLER (Feat. Supreme Boi),4:28",
				"Outro: Ego,3:16",
				"Her,3:48",
				"Filter,3:00",
				"Friends,3:19",
				"Singularity,3:16",
				"00:00 (Zero O'Clock),4:10",
				"Euphoria,3:48",
				"Dimple,3:16",
				"For Youth,4:24"
				));
		albumRespository.save(proof);
		
		Album mrMorale = new Album(null, "Mr Morale & The Big Steppers", "Kendrick Lamar", "1h 18m", Instant.parse("2022-05-13T00:00:00Z"), "https://open.spotify.com/album/79ONNoS4M9tfIA1mYLBYVX?si=KrAytYa4QtuJTHgmMZMqOA", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/mr-morale-big-steppers.jpg?raw=true", 0.0, 0);
		
		mrMorale.getSongs().addAll(Arrays.asList(
			
				"United in Grief,4:15",
				"N95,3:15",
				"Worldwide Steppers,3:23",
				"Die Hard,3:59",
				"Father Time,3:42",
				"Rich (Interlude),1:43",
				"Rich Spirit,3:22",
				"We Cry Together,5:41",
				"Purple Hearts,5:29",
				"Count Me Out,4:43",
				"Crown,4:24",
				"Silent Hill,3:40",
				"Savior (Interlude),2:32",
				"Savior,3:44",
				"Auntie Diaries,4:41",
				"Mr. Morale,3:30",
				"Mother I Sober,6:46",
				"Mirror,4:16",
				"The Heart Part 5,5:32"
				));
		albumRespository.save(mrMorale);
		
		Album theCar = new Album(null, "The Car", "Arctic Monkeys", "37min 23s", Instant.parse("2022-10-21T00:00:00Z"), "https://open.spotify.com/album/2GROf0WKoP5Er2M9RXVNNs?si=psKNj9MVRRGWd4T8r9BgXQ", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/the-car.jpg?raw=true", 0.0, 0);
		
		theCar.getSongs().addAll(Arrays.asList(
			
				"There'd Better Be a Mirrorball,4:25",
				"I Ain't Quite Where I Think I Am,3:11",
				"Sculptures of Anything Goes,3:59",
				"Jet Skis on the Moat,3:17",
				"Body Paint,4:50",
				"The Car,3:18",
				"Big Ideas,3:57",
				"Hello You,4:04",
				"Mr Schwartz,3:30",
				"Perfect Sense,2:47"
				));
		albumRespository.save(theCar);
		
		
		Album renaissance = new Album(null, "Renaissance", "Beyoncé", "1h 2min", Instant.parse("2022-07-29T00:00:00Z"), "https://open.spotify.com/album/6FJxoadUE4JNVwWHghBwnb?si=TpsABgHmRGmwAMFRyPucFA", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/Renaissancce.jpg?raw=true", 0.0, 0);
		
		renaissance.getSongs().addAll(Arrays.asList(
				"I’M THAT GIRL,3:28",
				"COZY,3:30",
				"ALIEN SUPERSTAR,3:35",
				"CUFF IT,3:45",
				"ENERGY,1:56",
				"BREAK MY SOUL,4:38",
				"CHURCH GIRL,3:44",
				"PLASTIC OFF THE SOFA,4:14",
				"VIRGO’S GROOVE,6:08",
				"MOVE,3:23",
				"HEATED,4:20",
				"THIQUE,4:04",
				"ALL UP IN YOUR MIND,2:49",
				"AMERICA HAS A PROBLEM,3:18",
				"PURE/HONEY,4:48",
				"SUMMER RENAISSANCE,4:34"
				));
		albumRespository.save(renaissance);
		
		
		Album dawnFm = new Album(null, "Dawn FM", "The Weeknd", "51min 49s", Instant.parse("2022-01-06T00:00:00Z"), "https://open.spotify.com/album/2nLOHgzXzwFEpl62zAgCEC?si=dfhzIQqvT6qniaBVaIDltQ", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/dawn-fm-.jpg?raw=true", 0.0, 0);
		
		dawnFm.getSongs().addAll(Arrays.asList(
				"Dawn FM,1:37",
				"Gasoline,3:33",
				"How Do I Make You Love Me?,3:35",
				"Take My Breath,5:40",
				"Sacrifice,3:09",
				"A Tale By Quincy,1:37",
				"Out of Time,3:35",
				"Here We Go… Again,3:30",
				"Best Friends,2:44",
				"Is There Someone Else?,3:20",
				"Starry Eyes,2:28",
				"Every Angel is Terrifying,2:48",
				"Don’t Break My Heart,3:26",
				"I Heard You’re Married,4:24",
				"Less Than Zero,3:32",
				"Phantom Regret by Jim,3:00"
				));
		albumRespository.save(dawnFm);
		
		Album twelve = new Album(null, "Twelve Carat Toothache", "Post Malone", "43min 49s", Instant.parse("2022-06-03T00:00:00Z"), "https://open.spotify.com/album/3HHNR44YbP7XogMVwzbodx?si=6_mp5uFzQKix3VCf1CZ46Q", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/Twelve-carat.jpg?raw=true", 0.0, 0);
		
		twelve.getSongs().addAll(Arrays.asList(
				"Reputation,4:08",
				"Cooped Up,3:06",
				"Lemon Tree,4:03",
				"Wrapped Around Your Finger,3:13",
				"I Like You (A Happier Song),3:13",
				"I Cannot Be (A Sadder Song),2:49",
				"Insane,2:49",
				"Love/Hate Letter to Alcohol,3:03",
				"Wasting Angels,4:03",
				"Euthanasia,2:25",
				"When I’m Alone,3:15",
				"Waiting for a Miracle,2:21",
				"One Right Now,3:12",
				"New Recording 12. Jan 3. 2020,1:32"
				));
		albumRespository.save(twelve);
		
		
		Album dreamCanteen = new Album(null, "Return Of The Dream Canteen", "Red Hot Chili Peppers", "1h 15min", Instant.parse("2022-10-14T00:00:00Z"), "https://open.spotify.com/album/0KJc9ksnoJJsdpQxV3z5i1?si=aDYrWg3SQ0OEkLz-p4bz9g", "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/return-of-the-dream-canteen.jpg?raw=true", 0.0, 0);
		
		dreamCanteen.getSongs().addAll(Arrays.asList(
				"Tippa My Tongue,4:21",
				"Peace and Love,4:03",
				"Reach Out,4:12",
				"Eddie,5:42",
				"Fake as Fu@k,4:22",
				"Bella,4:51",
				"Roulette,4:57",
				"My Cigarette,4:24",
				"Afterlife,4:14",
				"Shoot Me a Smile,3:43",
				"Handful,4:00",
				"The Drummer,3:23",
				"Bag of Grins,5:06",
				"La La La La La La La La,3:57",
				"Copperbelly,3:45",
				"Carry Me Home,4:13",
				"In the Snow,5:55"
				));
		albumRespository.save(dreamCanteen);


		
	}

}
