import Img from "assets/img/john.png";
import "./style.css";

function Painel() {
  return (
    <>
      <div className="background">
        <div className="box">
          <div className="text">
            <p>Spotify Presents</p>
            <h1>Spotify Awards 2022</h1>
            <h4>Rate the top artists, albums and songs of the year.</h4>
          </div>
          <div className="img-celular">
            <img src={Img} alt="Celular Spotify" />
          </div>
        </div>
      </div>
    </>
  );
}

export default Painel;
