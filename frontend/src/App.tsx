import Navbar from "components/Navbar";
import React from "react";
import "./App.css";
import AppRoutes from "components/AppRoutes";
import Footer from "components/Footer";

function App() {
  return (
    <>
        <Navbar />
        <AppRoutes></AppRoutes>
        <Footer></Footer>
    </>
  );
}

export default App;
