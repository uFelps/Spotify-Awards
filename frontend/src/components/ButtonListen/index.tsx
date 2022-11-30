import Img from "assets/img/logo_spotify2.png";
import "./style.css";

type Props = {
  url: string;
};

function ButtonListen({ url }: Props) {
  return (
    <>
      <a href={url} className="link">
        <button className="botao-listen">
          <img src={Img} alt="logo" id="img-spotify-listen"></img>
          Listen
        </button>
      </a>
    </>
  );
}

export default ButtonListen;
