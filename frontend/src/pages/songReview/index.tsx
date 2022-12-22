import { Link, useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import "./style.css";
import axios, { AxiosRequestConfig } from "axios";
import { BASE_URL } from "util/requests";
import { Song } from "types/song";
import { validateEmail } from "util/validade";
import Loader from "components/Loader";

type Props = {
  route: string;
};

function SongReview({ route }: Props) {
  const params = useParams();
  const navegate = useNavigate();

  const [song, setSong] = useState<Song>();

  const [isLoaded, setIsLoaded] = useState(false);

  useEffect(() => {
    axios.get(`${BASE_URL}/${route}/${params.songId}`).then((response) => {
      setSong(response.data);
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
      url: "/scoreSong",
      data: {
        email: email,
        songId: params.songId,
        score: score,
      },
    };

    axios(config).then((response) => {
      if (song?.indicatedBestSong) {
        navegate("/confirmationVote/songs");
      } else if (song?.indicatedBestCategory) {
        if (song.category === "Pop") {
          navegate("/confirmationVote/best-pop");
        }
        if (song.category === "Rock") {
          navegate("/confirmationVote/best-rock");
        }
        if (song.category === "Hip-Hop") {
          navegate("/confirmationVote/best-hip-hop");
        }
      }
    });
  };

  return (
    <>
      <div className="song-title">
        <h1>Song Review</h1>
      </div>
      <div className="song-data">
        {!isLoaded && <Loader></Loader>}
        <div className="imagem">
          <img src={song?.img} alt="songimg" />
        </div>

        <div className="song-content">
          <div className="song-form-titles">
            <h1 id="name-song">{song?.title}</h1>
            <p id="song-artist">{song?.artist}</p>
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

export default SongReview;
