create table score_album (score_value float(53), album_id bigint not null, user_id bigint not null, primary key (album_id, user_id));
create table score_artist (score_value float(53), user_id bigint not null, artist_id bigint not null, primary key (artist_id, user_id));
create table score_song (score float(53), song_id bigint not null, user_id bigint not null, primary key (song_id, user_id));
create table tb_album (id bigserial not null, artist varchar(255), average float(53), count_votes integer, duration varchar(255), img varchar(255), name varchar(255), released timestamp(6) with time zone, songs varchar(255) array, url varchar(255), primary key (id));
create table tb_artist (id bigserial not null, average float(53), count_votes integer, image varchar(255), listeners varchar(255), name varchar(255), primary key (id));
create table tb_song (id bigserial not null, artist varchar(255), average float(53), category varchar(255), count_votes integer, duration varchar(255), img varchar(255), indicated_best_category boolean, indicated_best_song boolean, title varchar(255), url varchar(255), primary key (id));
create table tb_user (id bigserial not null, email varchar(255), primary key (id));
alter table if exists score_album add constraint FK6vdehshol07x8f800r98n9cff foreign key (album_id) references tb_album;
alter table if exists score_album add constraint FK9ogd65d4l1uob09djrqgq198k foreign key (user_id) references tb_user;
alter table if exists score_artist add constraint FKedyydla7x50ijr4y6e55uo4kh foreign key (user_id) references tb_user;
alter table if exists score_artist add constraint FKae38ehq2i6o5uqpvck5k64sfm foreign key (artist_id) references tb_artist;
alter table if exists score_song add constraint FKbnbsdydbrm69jx0ubk8cmkmdo foreign key (song_id) references tb_song;
alter table if exists score_song add constraint FKgv2doog9yx5oer4520uo9dtfh foreign key (user_id) references tb_user;


INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/harry.jpeg.png?raw=true' , '63.961.408', 'Harry Styles');
INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/kendrick-lamar.jpg.png?raw=true' , '37.552.617', 'Kendrick Lamar');
INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/post-malone.jpg.png?raw=true' , '50.243.221', 'Post Malone');
INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/doja-cat.jpeg.png?raw=true' , '50.332.358', 'Doja Cat');
INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/billie.jpg.png?raw=true' , '50.361.697', 'Billie Eilish');
INSERT INTO tb_artist (average, count_votes, image, listeners, name) VALUES(0, 0, 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/taylor-swif.jpg.png?raw=true' , '83.546.017', 'Taylor Swift');


INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('As is Was', 'Harry Styles', '2:37', 'Pop', true, false, 'https://open.spotify.com/track/4LRPiXqCikLlN15c3yImP7?si=8405e2769bfa4d9a', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/As-It-Was.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Anti-Hero', 'Taylor Swift', '3:20', 'Pop', true, false, 'https://open.spotify.com/track/0V3wPSX9ygBnCm8psDIegu?si=a215a95cb3404e20', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/anti-hero.png?raw=true', 0.0, 0);
		
INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('N95', 'Kendrick Lamar', '3:52', 'Hip-Hop', true, false, 'https://open.spotify.com/track/0fX4oNGBWO3dSGUZcVdVV2?si=015798ae3c7e4dc3', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/n95.png?raw=true', 0.0, 0);
		
INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('I Like You', 'Post Malone, Doja Cat', '3:52', 'Pop', true, false, 'https://open.spotify.com/track/0O6u0VJ46W86TxN9wgyqDj?si=cbf08479c29e488a', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/I-Like-You.jpg.png?raw=true', 0.0, 0);
		
INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Black Summer', 'Red Hot Chili Peppers', '3:52', 'Rock', true, false, 'https://open.spotify.com/track/3a94TbZOxhkI9xuNwYL53b?si=0d58ac9f99164ce3', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/black-summer.jpg.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Miss You', 'Oliver Tree', '3:26', 'Pop', true, false, 'https://open.spotify.com/track/73vIOb4Q7YN6HeJTbscRx5?si=7c58689be9c14ecf', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/songs-of-the-year/missyou.jpg.png?raw=true', 0.0, 0);




INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Unholy', 'Sam Smith, Kim Petras', '2:36', 'Pop', false, true, 'https://open.spotify.com/track/3nqQXoyQOWXiESFLlDF1hG?si=023b3f1087dc441c', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/unholy.jpg.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Break My Soul', 'Beyoncé', '4:38', 'Pop', false, true, 'https://open.spotify.com/track/2KukL7UlQ8TdvpaA7bY3ZJ?si=28d00316fcab437c', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/breakmysoul.jpeg.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Late Night Talking', 'Harry Styles', '2:57', 'Pop', false, true, 'https://open.spotify.com/track/1qEmFfgcLObUfQm0j1W2CK?si=b9920c0c6ad24468', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/lateNightTalking.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Lavender Haze', 'Taylor Swift', '3:22', 'Pop', false, true, 'https://open.spotify.com/track/5jQI2r1RdgtuT8S3iG8zFC?si=b23c047e38f54e14', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/taylor-swif.jpg.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Dynamite', 'BTS', '3:19', 'Pop', false, true, 'https://open.spotify.com/track/1hIuSG6xV4RDgD8bDVKP7N?si=d828241883a94b86', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/dynamite.jpg.png?raw=true', 0.0, 0);


INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Butter', 'BTS', '2:44', 'Pop', false, true, 'https://open.spotify.com/track/6jjYDGxVJsWS0a5wlVF5vS?si=707e9852b10b4ba3', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-pop/butter.png?raw=true', 0.0, 0);


INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Die Hard', 'Kendrick Lamar', '3:59', 'Hip-Hop', false, true, 'https://open.spotify.com/track/2g6tReTlM2Akp41g0HaeXN?si=d6cb3d5642ff4236', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/diehard.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Jimmy Cooks', 'Drake, 21 Savage', '3:38', 'Hip-Hop', false, true, 'https://open.spotify.com/track/3F5CgOj3wFlRv51JsHbxhe?si=308b31923d224861', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/jimmy.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Cooped Up', 'Post Malone, Roddy Ricch', '3:05', 'Hip-Hop', false, true, 'https://open.spotify.com/track/7DwcBgdzqhFJltEaV1XF81?si=58e6287474444f8b', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/cooppedup.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Family Ties', 'Baby Keem, Kendrick Lamar', '4:12', 'Hip-Hop', false, true, 'https://open.spotify.com/track/7Bpx2vsWfQFBACRz4h3IqH?si=b302e13019334ac9', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/familyties.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Rich Flex', 'Drake, 21 Savage', '3:59', 'Hip-Hop', false, true, 'https://open.spotify.com/track/1bDbXMyjaUIooNwFE9wn0N?si=5aad3c9693bf4947', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/richflex.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Island of Da Phonk Up', 'psycho7k', '1:49', 'Hip-Hop', false, true, 'https://open.spotify.com/track/2rHlvvsXY72TC8N71XZxkn?si=304e690b02484d6f', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-hip-hop/island.png?raw=true', 0.0, 0);



INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Tippa My Tongue', 'Red Hot Chili Peppers', '4:20', 'Rock', false, true, 'https://open.spotify.com/track/3s53zBEi1ZU6dJj19eFOxW?si=316e19c326004699', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/tippamytoungue.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('This is Why', 'Paramore', '3:27', 'Rock', false, true, 'https://open.spotify.com/track/7z84Fwf1R3Z2BwHCP620CI?si=460092134e524df7', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thisisway.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Body Paint', 'Arctic Monkeys', '4:50', 'Rock', false, true, 'https://open.spotify.com/track/42GuKw49pPxNAkIhWGwgFs?si=4632d7295b214dfa', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/bodypaint.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('The Dying Song', 'Slipknot', '3:23', 'Rock', false, true, 'https://open.spotify.com/track/6rsoBvxrlxdmqJyGPPciyq?si=9f247f6b390f4d20', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thedyingsong.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('Patient Number 9', 'Ozzy Osbourne, Jeff Beck', '7:21', 'Rock', false, true, 'https://open.spotify.com/track/3YYnFEXCLNbaWuC0hIEnIS?si=01575c29fe6a471c', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/ozzy-patient-number-9.png?raw=true', 0.0, 0);

INSERT INTO tb_song(title, artist, duration, category, indicated_best_song, indicated_best_category, url, img, average, count_votes)
VALUES('These Are The Ways', 'Red Hot Chili Peppers', '3:56', 'Rock', false, true, 'https://open.spotify.com/track/1KtXgVTeu3GUXHrOAef6QQ?si=8086e17dbf854aa9', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/best-rock/thesearetheways.png?raw=true', 0.0, 0);


INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Unlimited Love', 'Red Hot Chili Peppers', '1h 13m', '2022-04-01 00:00:00', 'https://open.spotify.com/album/2ITVvrNiINKRiW7wA3w6w6?si=8-gc2h3iSB2sVeXLdtWnHA', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/unlimited-love.jpg?raw=true', 0.0, 0,
ARRAY ['Black Summer,3:52', 'Here Ever After,3:50','Aquatic Mouth Dance,4:20','Not the One,4:26','Poster Child,5:18','The Great Apes,5:01', 'It''s Only Natural,5:33', 'She''s a Lover,3:41', 'These Are the Ways,3:56', 'Watchu Thinkin'',3:40', 'Bastards of Light, 3:38', 'White Braids & Pillow Chair,3:40', 'One Way Traffic,4:10', 'Veronica,4:28', 'Let ''Em Cry,4:23', 'The Heavy Wing,5:31', 'Tangelo,3:37' ]);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Harry''s House', 'Harry Styles', '41min 59s', '2022-05-20T00:00:00Z', 'https://open.spotify.com/album/5r36AJ6VOJtp00oxSkBZ5h?si=EzDz8oGXSoikcWUh9zDPdw', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/harrys-house.png?raw=true', 0.0, 0,
ARRAY ['Music For A Sushi Restaurant,03:02','Late Night Talking,03:08','Grapejuice,03:12','As It Was,02:47','Daylight,02:45','Little Freak,03:20','Matilda,04:05','Cinema,04:03','Daydreaming,03:07','Keep Driving,02:19','Satellite,03:37','Boyfriends,03:12','Love Of My Life,03:11']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Proof', 'BTS', '2h 8m', '2022-06-10 00:00:00', 'https://open.spotify.com/album/6al2VdKbb6FIz9d7lU7WRB?si=b06bc616f6d14ed7', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/proof.jpg?raw=true', 0.0, 0,
ARRAY ['Born Singer,3:58','No More Dream,3:42','N.O,3:29','Boy in Luv,3:51','Danger,4:05','I NEED U,3:30','RUN,3:56','FIRE,3:23','Blood Sweat & Tears,3:37','Spring Day,4:34','DNA,3:43','FAKE LOVE,4:02','IDOL,3:42','Boy With Luv (Feat. Halsey),3:49','ON,4:06','Dynamite,3:19','Life Goes On,3:28','Butter,2:44','Yet To Come,3:13','Run BTS,3:24','Intro: Persona,2:51','Stay,3:26','Moon,3:28','Jamais Vu,3:47','BTS Cypher PT.3: KILLER (Feat. Supreme Boi),4:28','Outro: Ego,3:16','Her,3:48','Filter,3:00','Friends,3:19','Singularity,3:16','00:00 (Zero O'Clock),4:10','Euphoria,3:48','Dimple,3:16','For Youth,4:24']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Mr Morale & The Big Steppers', 'Kendrick Lamar', '1h 18m', '2022-05-13 00:00:00', 'https://open.spotify.com/album/79ONNoS4M9tfIA1mYLBYVX?si=KrAytYa4QtuJTHgmMZMqOA', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/mr-morale-big-steppers.jpg?raw=true', 0.0, 0,
ARRAY ['United in Grief,4:15','N95,3:15','Worldwide Steppers,3:23','Die Hard,3:59','Father Time,3:42','Rich (Interlude),1:43','Rich Spirit,3:22','We Cry Together,5:41','Purple Hearts,5:29','Count Me Out,4:43','Crown,4:24','Silent Hill,3:40','Savior (Interlude),2:32','Savior,3:44','Auntie Diaries,4:41','Mr. Morale,3:30','Mother I Sober,6:46','Mirror,4:16','The Heart Part 5,5:32']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('The Car', 'Arctic Monkeys', '37min 23s', '2022-10-21 00:00:00', 'https://open.spotify.com/album/2GROf0WKoP5Er2M9RXVNNs?si=psKNj9MVRRGWd4T8r9BgXQ', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/the-car.jpg?raw=true', 0.0, 0,
ARRAY ['There''d Better Be a Mirrorball,4:25','I Ain''t Quite Where I Think I Am,3:11','Sculptures of Anything Goes,3:59','Jet Skis on the Moat,3:17','Body Paint,4:50','The Car,3:18','Big Ideas,3:57','Hello You,4:04','Mr Schwartz,3:30','Perfect Sense,2:47']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Renaissance', 'Beyoncé', '1h 2min', '2022-07-29 00:00:00', 'https://open.spotify.com/album/6FJxoadUE4JNVwWHghBwnb?si=TpsABgHmRGmwAMFRyPucFA', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/Renaissancce.jpg?raw=true', 0.0, 0,
ARRAY ['I’M THAT GIRL,3:28','COZY,3:30','ALIEN SUPERSTAR,3:35','CUFF IT,3:45','ENERGY,1:56','BREAK MY SOUL,4:38','CHURCH GIRL,3:44','PLASTIC OFF THE SOFA,4:14','VIRGO’S GROOVE,6:08','MOVE,3:23','HEATED,4:20','THIQUE,4:04','ALL UP IN YOUR MIND,2:49','AMERICA HAS A PROBLEM,3:18','PURE/HONEY,4:48','SUMMER RENAISSANCE,4:34']);


INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Dawn FM', 'The Weeknd', '51min 49s', '2022-01-06 00:00:00', 'https://open.spotify.com/album/2nLOHgzXzwFEpl62zAgCEC?si=dfhzIQqvT6qniaBVaIDltQ', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/dawn-fm-.jpg?raw=true', 0.0, 0, 
ARRAY ['Dawn FM,1:37','Gasoline,3:33','How Do I Make You Love Me?,3:35','Take My Breath,5:40','Sacrifice,3:09','A Tale By Quincy,1:37','Out of Time,3:35','Here We Go… Again,3:30','Best Friends,2:44','Is There Someone Else?,3:20','Starry Eyes,2:28','Every Angel is Terrifying,2:48','Don’t Break My Heart,3:26','I Heard You’re Married,4:24','Less Than Zero,3:32','Phantom Regret by Jim,3:00']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Twelve Carat Toothache', 'Post Malone', '43min 49s', '2022-06-03 00:00:00', 'https://open.spotify.com/album/3HHNR44YbP7XogMVwzbodx?si=6_mp5uFzQKix3VCf1CZ46Q', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/Twelve-carat.jpg?raw=true', 0.0, 0,
ARRAY ['Reputation,4:08','Cooped Up,3:06','Lemon Tree,4:03','Wrapped Around Your Finger,3:13','I Like You (A Happier Song),3:13','I Cannot Be (A Sadder Song),2:49','Insane,2:49','Love/Hate Letter to Alcohol,3:03','Wasting Angels,4:03','Euthanasia,2:25','When I’m Alone,3:15','Waiting for a Miracle,2:21','One Right Now,3:12','New Recording 12. Jan 3. 2020,1:32']);

INSERT INTO tb_album (name, artist, duration, released, url, img, average, count_votes, songs)
VALUES('Return Of The Dream Canteen', 'Red Hot Chili Peppers', '1h 15min', '2022-10-14 00:00:00', 'https://open.spotify.com/album/0KJc9ksnoJJsdpQxV3z5i1?si=aDYrWg3SQ0OEkLz-p4bz9g', 'https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/return-of-the-dream-canteen.jpg?raw=true', 0.0, 0,
ARRAY ['Tippa My Tongue,4:21','Peace and Love,4:03','Reach Out,4:12','Eddie,5:42','Fake as Fu@k,4:22','Bella,4:51','Roulette,4:57','My Cigarette,4:24','Afterlife,4:14','Shoot Me a Smile,3:43','Handful,4:00','The Drummer,3:23','Bag of Grins,5:06','La La La La La La La La,3:57','Copperbelly,3:45','Carry Me Home,4:13','In the Snow,5:55']);




