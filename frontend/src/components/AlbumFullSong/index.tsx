import "./style.css";

type Props = {
  number: number;
  song: string;
  artist: string;
};

function AlbumFullSong({ number, artist, song }: Props) {
  let songProperties = song.split(",");

  return (
    <>
      <div className="albumFullSong">
        <h1>{number}</h1>
        <div className="song-artist">
          <h2>{songProperties[0]}</h2>
          <h3>{artist}</h3>
        </div>
        <p>{songProperties[1]}</p>
      </div>
    </>
  );
}

export default AlbumFullSong;
