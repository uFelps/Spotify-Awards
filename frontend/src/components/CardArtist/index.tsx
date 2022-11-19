import ButtonEvaluate from "components/ButtonEvaluate";
import ScoreStars from "components/ScoreStars";
import { Artist } from "types/artist";
import "./style.css";

type Props = {
  artist: Artist;
};

function CardArtist({ artist }: Props) {
  return (
    <>
      <div className="artist-card">
        <img src={artist.image} alt="img"></img>
        <div className="conteudo">
          <h1>{artist.name}</h1>
          <ScoreStars average={artist.average} countVotes={artist.countVotes}></ScoreStars>
          <ButtonEvaluate url="/score-artist"></ButtonEvaluate>
        </div>
      </div>
    </>
  );
}

export default CardArtist;
