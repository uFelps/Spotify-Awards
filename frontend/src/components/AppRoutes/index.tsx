import ArtistReview from "pages/artistReview";
import Artists from "pages/artists";
import Main from "pages/main";
import SongReview from "pages/songReview";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import SongsOfTheYear from "pages/SongsOfTheYear";
import BestPop from "pages/bestPop";
import BestHipHop from "pages/bestHipHop";
import BestRock from "pages/bestRock";
import Albuns from "pages/albuns";
import AlbumFull from "pages/albumFull";
import AlbumReview from "pages/albumReview";
import ConfirmationVote from "pages/confirmationVote";

function AppRoutes() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path={"/"} element={<Main></Main>}></Route>
        <Route path="/artists" element={<Artists></Artists>}></Route>
        <Route path="/albuns" element={<Albuns></Albuns>}></Route>
        <Route path="/songs-of-the-year" element={<SongsOfTheYear></SongsOfTheYear>}></Route>
        <Route path="/best-pop" element={<BestPop></BestPop>}></Route>
        <Route path="/best-rock" element={<BestRock></BestRock>}></Route>
        <Route path="/best-hip-hop" element={<BestHipHop></BestHipHop>}></Route>
        <Route path="/artist-review">
          <Route path=":artistId" element={<ArtistReview></ArtistReview>} />
        </Route>
        <Route path="/song-of-the-year-review">
          <Route path=":songId" element={<SongReview route="song-of-the-year"></SongReview>} />
        </Route>
        <Route path="/album-full">
          <Route path=":albumId" element={<AlbumFull></AlbumFull>} />
        </Route>
        <Route path="/album-review">
          <Route path=":albumId" element={<AlbumReview></AlbumReview>}></Route>
        </Route>
        <Route path="/confirmationVote/album" element={<ConfirmationVote url="/albuns"></ConfirmationVote>}></Route>
        <Route path="/confirmationVote/artist" element={<ConfirmationVote url="/artists"></ConfirmationVote>}></Route>
        <Route path="/confirmationVote/songs" element={<ConfirmationVote url="/songs-of-the-year"></ConfirmationVote>}></Route>
        <Route path="/confirmationVote/best-pop" element={<ConfirmationVote url="/best-pop"></ConfirmationVote>}></Route>
        <Route path="/confirmationVote/best-hip-hop" element={<ConfirmationVote url="/best-hip-hop"></ConfirmationVote>}></Route>
        <Route path="/confirmationVote/best-rock" element={<ConfirmationVote url="/best-rock"></ConfirmationVote>}></Route>
        
      </Routes>
    </BrowserRouter>
  );
}

export default AppRoutes;
