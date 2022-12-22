import Img from "assets/img/loader.svg";
import "./style.css";

function LoadingCard(){
    return(
        <div className="loadingSongCard">
            <img id="loadingSongCard" src={Img} alt={"Loader"}></img>
        </div>
    );

}

export default LoadingCard;