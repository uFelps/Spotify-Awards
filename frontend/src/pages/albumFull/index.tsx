import axios from "axios";
import AlbumFullHeader from "components/AlbumFullHeader";
import AlbumFullSong from "components/AlbumFullSong";
import { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import { Album } from "types/album";
import { BASE_URL } from "util/requests";
import "./style.css";

function getReleased(album: Album) {
  const released = { time: album.released };

  let date = new Date(released.time).toLocaleString("en-US", {
    year: "numeric",
    month: "long",
    day: "numeric",
    timeZone: "UTC",
  });

  return date;
}

function AlbumFull() {
  const params = useParams();
  const [album, setAlbum] = useState<Album>({
    id: 0,
    name: "",
    artist: "",
    duration: "1h 13m",
    released: "",
    url: "",
    img: "",
    average: 0.0,
    countVotes: 0,
    songs: [],
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/albuns/${params.albumId}`).then((response) => {
      setAlbum(response.data);
    });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  /* DATE */
  let count = 1;

  return (
    <>
      <AlbumFullHeader album={album}></AlbumFullHeader>

      <div className="album-songs">
        {album?.songs.map((song) => (
          <AlbumFullSong
            key={count}
            number={count++}
            artist={album.artist}
            song={song}
          ></AlbumFullSong>
        ))}

        <div className="album-date">{getReleased(album)}</div>
      </div>
    </>
  );
}

export default AlbumFull;
