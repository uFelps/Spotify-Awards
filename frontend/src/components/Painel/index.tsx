import Img from "assets/img/celular.png";
import "./style.css";

function Painel() {
  return (
    <>
      <div className="background">
        <div className="box">
          <div className="text">
            <p>Spotify Presents</p>
            <h1>Spotify Awards</h1>
            <h4>Avalie os principais artistas, albuns e musicas do ano.</h4>
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
