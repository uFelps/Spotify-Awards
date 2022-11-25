import Songs from "components/songs";

function SongsOfTheYear(){
    return(
        //url = link q será usado para consumir a api
        <Songs title="Songs Of The Year" url="/song-of-the-year" color="linear-gradient(to right, #0C3C3A, #20AE37)"></Songs>

    );
}

export default SongsOfTheYear;