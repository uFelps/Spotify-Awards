import CardArtist from "components/CardArtist";
import SpotifyPresents from "components/Spotify Presents";
import "./style.css";

function Artists() {
  const artists = [
    {
      id: 1,
      name: "Red Hot Chili Peppers",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/RedHotChiliPeppers.jpg?raw=true",
      listeners: "26.298.433",
      average: 4.5,
      countVotes: 2,
    },

    {
      id: 2,
      name: "Kendrick Lamar",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/kendrick-lamar.jpg.png?raw=true",
      listeners: "37.552.617",
      average: 5.0,
      countVotes: 2,
    },

    {
      id: 3,
      name: "Post Malone",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/post-malone.jpg.png?raw=true",
      listeners: "50.365.046",
      average: 5.0,
      countVotes: 2,
    },

    {
      id: 1,
      name: "Red Hot Chili Peppers",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/RedHotChiliPeppers.jpg?raw=true",
      listeners: "26.298.433",
      average: 4.5,
      countVotes: 2,
    },

    {
      id: 2,
      name: "Kendrick Lamar",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/kendrick-lamar.jpg.png?raw=true",
      listeners: "37.552.617",
      average: 5.0,
      countVotes: 2,
    },

    {
      id: 3,
      name: "Post Malone",
      image:
        "https://github.com/uFelps/assets/blob/main/Spotify-Awards/artists/post-malone.jpg.png?raw=true",
      listeners: "50.365.046",
      average: 5.0,
      countVotes: 2,
    },
  ];

  return (
    <>
      <SpotifyPresents
        title="Artists Of The Year"
        color="linear-gradient(to right, #060D3B, #02C5C7)"
      ></SpotifyPresents>
      <div className="artists">
        <div className="title">
          <h1>Artists</h1>
        </div>

        <div className="container">
          <div className="row">
            {artists.map((artist) => (
              <div className="col-12 col-sm-12 col-md-6 col-lg-4" id="card">
                <CardArtist artist={artist}></CardArtist>
              </div>
            ))}
          </div>
        </div>
      </div>
    </>
  );
}

export default Artists;
