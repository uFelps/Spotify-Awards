import { useNavigate, useParams } from "react-router-dom";
import { useState, useEffect } from "react";
import "./style.css";
import axios, { AxiosRequestConfig } from "axios";
import { BASE_URL } from "util/requests";
import { Artist } from "types/artist";
import { Link } from "react-router-dom";
import { validateEmail } from "util/validade";
import Loader from "components/Loader";

function ArtistReview() {
  const params = useParams();

  const navegate = useNavigate();

  const [artist, setArtist] = useState<Artist>();

  const [isLoaded, setIsLoaded] = useState(false);

  useEffect(() => {
    axios.get(`${BASE_URL}/artists/${params.artistId}`).then((response) => {
      setTimeout(() => {
        setArtist(response.data);
        setIsLoaded(true);
      }, 4000);
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
      url: "/artistScore",
      data: {
        email: email,
        artistId: params.artistId,
        score: score,
      },
    };

    axios(config).then((response) => {
      navegate("/confirmationVote/artist");
    });
  };

  return (
    <>
      <div className="artist-title">
        <h1>Artist Review</h1>
      </div>
      <div className="artist-data">
        <div className="imagem">
          {!isLoaded && <Loader></Loader>}
          <img src={artist?.image} alt="artistimg" />
        </div>

        <div className="artist-content">
          <div className="artist-form-titles">
            <h1 id="name-artist">{artist?.name}</h1>
            <p id="listeners">{artist?.listeners} Listeners</p>
          </div>

          <form onSubmit={handleSubmit} className="form-review">
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
              <Link to={"/"}>
                <button id="cancelar">Cancel</button>
              </Link>
              <button type="submit" id="salvar">
                Save
              </button>
            </div>
          </form>
        </div>
      </div>
    </>
  );
}

export default ArtistReview;
