import ArtistReview from "pages/artistReview";
import Artists from "pages/artists";
import Main from "pages/main";
import SongReview from "pages/songReview";
import Songs from "pages/songs";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function AppRoutes() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Main></Main>}></Route>
        <Route path="/artists" element={<Artists></Artists>}></Route>
        <Route path="/albuns" element={<Artists></Artists>}></Route>
        <Route path="/songs-of-the-year" element={<Songs></Songs>}></Route>
        <Route path="/best-pop" element={<Artists></Artists>}></Route>
        <Route path="/best-rock" element={<Artists></Artists>}></Route>
        <Route path="/best-hip-hop" element={<Artists></Artists>}></Route>
        <Route path="/artist-review">
          <Route path=":artistId" element={<ArtistReview></ArtistReview>} />
        </Route>
        <Route path="/song-of-the-year-review">
          <Route path=":songId" element={<SongReview route="song-of-the-year"></SongReview>} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default AppRoutes;
