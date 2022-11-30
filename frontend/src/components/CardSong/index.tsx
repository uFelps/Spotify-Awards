import ButtonListen from "components/ButtonListen";
import ButtonVote from "components/ButtonVote";
import ScoreStars from "components/ScoreStars";
import { Song } from "types/song";
import "./style.css";

type Props = {
  song: Song;
};

function CardSong({ song }: Props) {
  return (
    <>
      <div className="song-card">
        <img src={song.img} alt="img"></img>
        <div className="conteudo">
          <h1>{song.title}</h1>
          <p id="song-card-p">{song.artist}</p>
          <ScoreStars average={song.average}></ScoreStars>
          <div className="buttons-card-song">
            <ButtonVote
              url={"/song-of-the-year-review/" + song.id}
            ></ButtonVote>
            <ButtonListen url={song.url}></ButtonListen>
          </div>
        </div>
      </div>
    </>
  );
}

export default CardSong;
