import ButtonVote from "components/ButtonVote";
import ScoreStars from "components/ScoreStars";
import { Artist } from "types/artist";
import {useState} from 'react';
import "./style.css";
import LoadingCard from "components/LoadingCard";

type Props = {
  artist: Artist;
};

function CardArtist({ artist }: Props) {

  const [isLoaded, setIsLoaded] = useState(false);

  return (
    <>
      <div className="artist-card">
       {!isLoaded && <LoadingCard/>}
        <img src={artist.image} alt="img" onLoad={()=> {setIsLoaded(true)}}></img>
        <div className="conteudo">
          <h1>{artist.name}</h1>
          <ScoreStars average={artist.average}></ScoreStars>
          <div className="artist-card-button">
            <ButtonVote url={"/artist-review/" + artist.id}></ButtonVote>
          </div>
        </div>
      </div>
    </>
  );
}

export default CardArtist;
