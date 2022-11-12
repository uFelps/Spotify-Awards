import { ReactComponent as SpotifyLogo } from "assets/img/logo_spotify.svg";
import "./style.css";
import { BrowserRouter, Link } from "react-router-dom";
import "bootstrap-icons/font/bootstrap-icons.css";
import { useState } from "react";

function Navbar() {

  const [click, setClick] = useState(false);

  const handleClick = () => setClick(!click);

  return (
    <BrowserRouter>
    <header>
      <div className="content">
        <div className="logo">

          <Link to={"/"}><SpotifyLogo></SpotifyLogo></Link>
        </div>

        <nav id="navbar" className={click ? "navbar-active" : "dis"}>
          
            <Link className="links" onClick={handleClick} to={"/artists"}>Artists</Link>
            <Link className="links" onClick={handleClick} to={"/albuns"}>Albuns</Link>
            <Link className="links" onClick={handleClick} to={"/songs-of-the-year"}>Songs</Link>
            <Link className="links" onClick={handleClick} to={"/bestpop"}>Pop</Link>
            <Link className="links" onClick={handleClick} to={"/best-hip-hop"}>Hip-Hop</Link>
            <Link className="links" onClick={handleClick} to={"/best-rock"}>Rock</Link>

        </nav>

        <i className={click ? "bi bi-x-circle" : "bi bi-list"} onClick={handleClick}></i>
      </div>
    </header>
    </BrowserRouter>
  );
}

export default Navbar;
