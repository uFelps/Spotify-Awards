import { ReactComponent as StarFull } from "assets/img/stars/star-full.svg";
import { ReactComponent as StarHalf } from "assets/img/stars/star-half.svg";
import { ReactComponent as StarEmpty } from "assets/img/stars/star-empty.svg";
import './style.css';

type Props = {
  average: number;
};

type StarProps = {
  fill: number;
};

function getFills(average: number) {
  const fills = [0, 0, 0, 0, 0];

  const integerPart = Math.floor(average);

  for (let i = 0; i < integerPart; i++) {
    fills[i] = 1;
  }

  const diff = average - integerPart;

  if (diff > 0) {
    fills[integerPart] = 0.5;
  }

  return fills;
}

function Star({ fill }: StarProps) {
  if (fill === 0) {
    return <StarEmpty></StarEmpty>;
  } else if (fill === 1) {
    return <StarFull></StarFull>;
  } else {
    return <StarHalf></StarHalf>;
  }
}

function Stars({ average }: Props) {
  const fills = getFills(average);

  return (
    <>
      <div className="stars-container">
        <Star fill={fills[0]}></Star>
        <Star fill={fills[1]}></Star>
        <Star fill={fills[2]}></Star>
        <Star fill={fills[3]}></Star>
        <Star fill={fills[4]}></Star>
      </div>
    </>
  );
}

export default Stars;
