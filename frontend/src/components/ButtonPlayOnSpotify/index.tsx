import Img from "assets/img/logo_spotify2.png";
import "./style.css";

type Props = {
  url: string;
};

function PlayOnSpotify({ url }: Props) {
  return (
    <>
      <a href={url} className="link">
        <div className="buttonPlayOnSpotify">
          <img src={Img} alt="spotify-logo"></img>
          <p>Play On Spotify</p>
        </div>
      </a>
    </>
  );
}

export default PlayOnSpotify;
