import axios from "axios";
import CardArtist from "components/CardArtist";
import SpotifyPresents from "components/Spotify Presents";
import { useEffect, useState } from "react";
import { Artist, ArtistPage } from "types/artist";
import { BASE_URL } from "util/requests";
import "./style.css";

function Artists() {
  const [artists, setArtists] = useState<ArtistPage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true,
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/artists`).then((response) => {
      const data = response.data as ArtistPage;
      setArtists(data);
    });
  });

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
            {artists.content.map((artist) => (
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
