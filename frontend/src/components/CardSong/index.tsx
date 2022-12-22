import ButtonListen from "components/ButtonListen";
import ButtonVote from "components/ButtonVote";
import ScoreStars from "components/ScoreStars";
import { Song } from "types/song";
import {useState} from 'react';
import "./style.css";
import LoadingCard from "components/LoadingCard";

type Props = {
  song: Song;
};

function CardSong({ song }: Props) {

  const [isLoaded, setIsLoaded] = useState(false);

  return (
    <>
      
      <div className="song-card" >
      {!isLoaded && <LoadingCard></LoadingCard>}
        <img src={song.img} alt="img" onLoad={()=> {setIsLoaded(true)}}></img>
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
