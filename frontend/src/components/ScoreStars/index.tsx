import Stars from "components/Stars";
import "./style.css";

type Props = {
  average: number;
  countVotes: number;
};

function ScoreStars({ average, countVotes }: Props) {
  return (
    <>
      <div className="score-itens">
        <div className="stars">
          <p>{average > 0 ? average.toFixed(1) : "-"}</p>
          <Stars average={average}></Stars>
        </div>
        <p>{countVotes + " reviews"}</p>
      </div>
    </>
  );
}

export default ScoreStars;
