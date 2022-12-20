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
              <h1>COMPANY</h1>
              <a href="/https://www.spotify.com/us/about-us/contact/">
                <h3>About</h3>
              </a>
              <a href="/https://www.lifeatspotify.com/">
                <h3>Jobs</h3>{" "}
              </a>
              <a href="/https://newsroom.spotify.com/">
                <h3>For the Record</h3>
              </a>
            </div>
            <div className="topico">
              <h1>COMMUNITIES</h1>
              <a href="/https://artists.spotify.com/">
                <h3>For Artists</h3>
              </a>
              <a href="/https://developer.spotify.com/">
                <h3>Developers</h3>
              </a>
              <a href="/https://ads.spotify.com/">
                <h3>Advertising</h3>{" "}
              </a>
              <a href="/https://investors.spotify.com/">
                <h3>Investors</h3>
              </a>
              <a href="/https://spotifyforvendors.com/">
                <h3>Vendors</h3>
              </a>
            </div>
            <div className="topico">
              <h1>USEFULL LINKS</h1>
              <a href="/https://support.spotify.com/">
                <h3>Support</h3>
              </a>
              <a href="/https://open.spotify.com/">
                <h3>Web Player</h3>{" "}
              </a>
              <a href="/https://www.spotify.com/us/free/">
                <h3>Free Mobile App</h3>
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
            <p>Spotify | ® All rights reserved</p>
            <p>Created by uFelps</p>
            <p>2022</p>
          </div>
        </div>
      </footer>
    </>
  );
}

export default Footer;
