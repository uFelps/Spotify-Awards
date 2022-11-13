import "./style.css";
import Img1 from "assets/img/logo_spotify.png";
import Img2 from "assets/img/instagram.png";
import Img3 from "assets/img/facebook.png";
import Img4 from "assets/img/twitter.png";

function Footer() {
  return (
    <>
      <footer>
        <div className="recuo2">
          <div className="content-footer">
            <div className="logo-footer">
              <img src={Img1} alt="logo spotify"/>
            </div>
            <div className="topico">
              <h1>EMPRESA</h1>
              <a href="/">
                <h3>Sobre</h3>
              </a>
              <a href="/">
                <h3>Empregos</h3>{" "}
              </a>
              <a href="/">
                <h3>For the Record</h3>
              </a>
            </div>
            <div className="topico">
              <h1>COMUNIDADE</h1>
              <a href="/">
                <h3>Para Artistas</h3>
              </a>
              <a href="/">
                <h3>Desenvolvedores</h3>
              </a>
              <a href="/">
                <h3>Publicidade</h3>{" "}
              </a>
              <a href="/">
                <h3>Investidores</h3>
              </a>
              <a href="/">
                <h3>Fornecedores</h3>
              </a>
            </div>
            <div className="topico">
              <h1>LINKS ÚTEIS</h1>
              <a href="/">
                <h3>Suporte</h3>
              </a>
              <a href="/">
                <h3>Player da Web</h3>{" "}
              </a>
              <a href="/">
                <h3>Aplicativo móvel grátis</h3>
              </a>
            </div>
            <div className="redes">
              <a href="https://www.instagram.com/spotify/" target="_blank" rel="noreferrer">
                <img src={Img2} alt="Instagram"/>
              </a>
              <a href="https://twitter.com/Spotify" target="_blank" rel="noreferrer">
                <img src={Img4} alt="Twitter" />
              </a>
              <a
                href="https://pt-br.facebook.com/SpotifyBrasil/"
                target="_blank" rel="noreferrer"
              >
                <img src={Img3} alt="facebook" />
              </a>
            </div>
          </div>
          <div className="createby">
            <p>Spotify | ® Todos os direitos reservados</p>
            <p>Created by uFelps</p>
            <p>2022</p>
          </div>
        </div>
      </footer>
    </>
  );
}

export default Footer;
