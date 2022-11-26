import axios from "axios";
import CardAlbum from "components/CardAlbum";
import SpotifyPresents from "components/Spotify Presents";
import { useState, useEffect } from 'react';
import { AlbumPage } from "types/album";
import { BASE_URL } from "util/requests";
import "./style.css";


function Albuns(){

    const [albuns, setAlbuns] = useState<AlbumPage>({
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true,
      });
    
    useEffect(() => {
        axios.get(`${BASE_URL}/albuns`)
        .then((response) => {
            setAlbuns(response.data);
        });
    }, []);


    return(
        <>
        <SpotifyPresents title="Albuns Of The Year" color="linear-gradient(to right, #2D2055,#614FB1)"></SpotifyPresents>
        <div className="albuns">
        <div className="albuns-title">
          <h1>Albuns</h1>
        </div>

        <div className="container">
          <div className="row">
            {albuns.content.map((album) => (
              <div key={album.id} className="col-12 col-sm-12 col-md-6 col-lg-4" id="card">
                <CardAlbum album={album}></CardAlbum>
              </div>
            ))}
          </div>
        </div>
      </div>
        </>
    );
}

export default Albuns;