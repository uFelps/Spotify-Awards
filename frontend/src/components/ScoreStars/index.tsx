import Stars from "components/Stars";
import "./style.css";

type Props = {
  average: number;
};

function ScoreStars({ average }: Props) {
  return (
    <>
      <div className="stars">
        <p className="score-stars-p">{average > 0 ? average.toFixed(1) : "-"}</p>
        <Stars average={average}></Stars>
      </div>
    </>
  );
}

export default ScoreStars;
