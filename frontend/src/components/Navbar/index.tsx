import { ReactComponent as SpotifyLogo } from "assets/img/logo_spotify.svg";
import "./style.css";
import "bootstrap-icons/font/bootstrap-icons.css";
import { useState } from "react";


function Navbar() {

  const [click, setClick] = useState(false);

  const handleClick = () => setClick(!click);

  return (
    <header>
      <div className="content">
        <div className="logo">

          <a href="/"><SpotifyLogo></SpotifyLogo></a>
        </div>

        <nav id="navbar" className={click ? "navbar-active" : "dis"}>
            <a href={'/artists'} className="links" onClick={handleClick}>Artists</a>
            <a href={'/albuns'} className="links" onClick={handleClick}>Albuns</a>
            <a href={'/songs-of-the-year'} className="links" onClick={handleClick}>Songs</a>
            <a href={'/artists'} className="links" onClick={handleClick}>Pop</a>
            <a href={'/artists'} className="links" onClick={handleClick}>Hip-Hop</a>
            <a href={'/artists'} className="links" onClick={handleClick}>Rock</a>
        </nav>

        <i className={click ? "bi bi-x-circle" : "bi bi-list"} onClick={handleClick}></i>
      </div>
    </header>
  );
}

export default Navbar;
