import { Link, useNavigate, useParams } from "react-router-dom";
import { useState, useEffect } from "react";
import { Album } from "types/album";
import axios, { AxiosRequestConfig } from "axios";
import { BASE_URL } from "util/requests";
import { validateEmail } from "util/validade";
import Loader from "components/Loader";

function AlbumReview() {
  const params = useParams();

  const navegate = useNavigate();

  const [album, setAlbum] = useState<Album>();

  const [isLoaded, setIsLoaded] = useState(false);

  useEffect(() => {
    axios.get(`${BASE_URL}/albuns/${params.albumId}`).then((response) => {
      setAlbum(response.data);
      setIsLoaded(true);
    });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();

    const email = (event.target as any).email.value;
    const score = (event.target as any).score.value;

    if (!validateEmail(email)) {
      return;
    }

    const config: AxiosRequestConfig = {
      baseURL: BASE_URL,
      method: "PUT",
      url: "/scoreAlbum",
      data: {
        email: email,
        albumId: params.albumId,
        score: score,
      },
    };

    axios(config).then((response) => {
      navegate("/confirmationVote/album");
    });
  };

  //o css utilizado nessa pagina é o song Review style.css

  return (
    <>
      <div className="song-title">
        <h1>Album Review</h1>
      </div>
      <div className="song-data">
        {!isLoaded && <Loader></Loader>}
        <div className="imagem">
          <img src={album?.img} alt="songimg" />
        </div>

        <div className="song-content">
          <div className="song-form-titles">
            <h1 id="name-song">{album?.name}</h1>
            <p id="song-artist">{album?.artist}</p>
          </div>

          <form onSubmit={handleSubmit}>
            <div className="email">
              <label>Inform your email</label>
              <input type="email" id="email"></input>
            </div>
            <div>
              <label>Submit your review</label>
              <select id="score">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
              </select>
            </div>
            <div className="buttons">
              <Link to={"/albuns"}>
                <button id="cancelar">Cancelar</button>
              </Link>
              <button type="submit" id="salvar">
                Salvar
              </button>
            </div>
          </form>
        </div>
      </div>
    </>
  );
}

export default AlbumReview;
