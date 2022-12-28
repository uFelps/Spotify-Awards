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

        <i className={"bi bi-list"} onClick={handleClick}></i>
        <nav id="navbar" className={click ? "navbar-active" : "dis"}>
            <i className={"bi bi-x-circle"} onClick={handleClick}></i>
            <a href={'/artists'} className="links" onClick={handleClick}>Artists</a>
            <a href={'/albuns'} className="links" onClick={handleClick}>Albums</a>
            <a href={'/songs-of-the-year'} className="links" onClick={handleClick}>Songs</a>
            <a href={'/best-pop'} className="links" onClick={handleClick}>Pop</a>
            <a href={'/best-hip-hop'} className="links" onClick={handleClick}>Hip-Hop</a>
            <a href={'/best-rock'} className="links" onClick={handleClick}>Rock</a>
            
        </nav>

        
      </div>
    </header>
  );
}

export default Navbar;
