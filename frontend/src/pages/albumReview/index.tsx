

const album = {
  id: 1,
  name: "Unlimited Love",
  artist: "Red Hot Chili Peppers",
  duration: "1h 13m",
  released: "2022-04-01T00:00:00Z",
  url: "https://open.spotify.com/album/2ITVvrNiINKRiW7wA3w6w6?si=8-gc2h3iSB2sVeXLdtWnHA",
  img: "https://github.com/uFelps/assets/blob/main/Spotify-Awards/albuns/unlimited-love.jpg?raw=true",
  average: 0.0,
  countVotes: 0,
  songs: [
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
    "Tangelo,3:37",
  ],
};

function AlbumReview() {
    
  return (
    <>
      <h1>Album Review</h1>
      <img src={album.img} alt="capa" id="album-capa"></img>
      <p></p>
    </>
  );
}

export default AlbumReview;
