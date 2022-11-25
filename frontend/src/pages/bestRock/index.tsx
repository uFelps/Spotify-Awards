import Songs from "components/songs";

function BestRock(){
    return(
        //url = link q será usado para consumir a api
        <Songs title="Best Rock" url="/best-rock" color="linear-gradient(to right, #F8130B, #6B218B)"></Songs>
    );
}

export default BestRock;