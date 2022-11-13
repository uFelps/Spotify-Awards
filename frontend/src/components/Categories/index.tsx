import Img1 from "assets/img/artistsoftheyear.png";
import Img2 from "assets/img/albunsoftheyear.png";
import Img3 from "assets/img/songsoftheyear.png";
import Img4 from "assets/img/bestpop.png";
import Img5 from "assets/img/bestrock.png";
import Img6 from "assets/img/besthiphop.png";
import CategoriesCard from "components/CategoriesCard";
import "./style.css";

function Categories() {
  return (
    <>
      <div>
        <div className="header">
          <h1 className="title">Categories</h1>
          <h2 className="a">...........................................</h2>
        </div>

        <div className="container">
          <div className="row">
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
              <a href="/artists"><CategoriesCard img={Img1}></CategoriesCard></a>
            </div>
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
            <a href="/albuns"><CategoriesCard img={Img2}></CategoriesCard></a>
            </div>
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
              <a href="/songs"><CategoriesCard img={Img3}></CategoriesCard></a>
            </div>
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
              <a href="/song-of-the-year"><CategoriesCard img={Img4}></CategoriesCard></a>
            </div>
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
            <a href="/best-rock"><CategoriesCard img={Img5}></CategoriesCard></a>
            </div>
            <div className="col-sm-12 col-md-6 col-lg-4 cards">
            <a href="/best-hip-hop"><CategoriesCard img={Img6}></CategoriesCard></a>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Categories;
