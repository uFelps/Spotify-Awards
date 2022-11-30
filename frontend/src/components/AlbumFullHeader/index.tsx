import PlayOnSpotify from "components/ButtonPlayOnSpotify";
import ButtonVote from "components/ButtonVote";
import ScoreStars from "components/ScoreStars";
import { Album } from "types/album";
import "./style.css";

type Props = {
  album: Album;
};

function AlbumFullHeader({ album }: Props) {
  return (
    <>
      <div className="album-full">
        <div className="album-full-header">
          <img src={album.img} alt="capa" id="album-capa"></img>
          <div className="album-review-content">
            <h1 id="album-h1">ALBUM</h1>
            <h1>{album.name}</h1>
            <p className="album-full-dados">{`${album.artist} | ${album.duration}`}</p>
            <div className="album-full-score">
              <div className="album-full-button">
                <ButtonVote url={`/album-review/${album.id}`}></ButtonVote>
              </div>
              <ScoreStars average={album.average}></ScoreStars>
            </div>
          </div>
        </div>
        <div className="bt-playonspotify">
          <PlayOnSpotify url={album.url}></PlayOnSpotify>
        </div>
      </div>
    </>
  );
}

export default AlbumFullHeader;
