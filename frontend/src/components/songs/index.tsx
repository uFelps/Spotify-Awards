import axios from "axios";
import CardSong from "components/CardSong";
import SpotifyPresents from "components/Spotify Presents";
import { useEffect, useState } from "react";
import { SongPage } from "types/song";
import { BASE_URL } from "util/requests";
import "./style.css";

type Props = {
  title: string;
  url: string;
  color: string;
}

function Songs({title, url, color} : Props) {
  
  const [songs, setSongs] = useState<SongPage>({
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
    axios.get(`${BASE_URL}${url}`)
    .then((response) => {
        const data = response.data as SongPage;
        setSongs(data);
    })
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);




  return (
    <>
      <SpotifyPresents
        title={title}
        color={color}
      ></SpotifyPresents>
      <div className="songs">
        <div className="title">
          <h1>Songs</h1>
        </div>
        <div className="container">
          <div className="row">
            {songs.content.map((song) => (
                <div className="col-12 col-sm-12 col-md-6 col-lg-4" id="card">
                <CardSong song={song}></CardSong>
              </div>
            ))}
          </div>
        </div>
      </div>
    </>
  );
}

export default Songs;
