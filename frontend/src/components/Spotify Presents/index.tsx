import Logo from "assets/img/logo_spotify.png";
import "./style.css";

type Props ={
    title: string
    color: string
}

function SpotifyPresents({title, color} : Props) {

  
  
  return (
    <>
      <div className="grupo" id="grupo" style={{background: color}}>
        <img src={Logo} alt="logo"></img>
        <p>Presents</p>
        <h1>{title}</h1>
      </div>
    </>
  );
}

export default SpotifyPresents;
