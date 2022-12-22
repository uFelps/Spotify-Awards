import Img from "assets/img/loader.svg";
import './style.css';

function Loader(){
    return(
        <div className="loader-container">
            <img id="loader" src={Img} alt={"Loader"}></img>
        </div>
    );
}

export default Loader;