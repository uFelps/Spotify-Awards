import Artists from "pages/artists";
import Main from "pages/main";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function AppRoutes(){
    return(

        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Main></Main>}></Route>
                <Route path="/artists" element={<Artists></Artists>}></Route>
            </Routes>
        </BrowserRouter>
    );
}

export default AppRoutes;