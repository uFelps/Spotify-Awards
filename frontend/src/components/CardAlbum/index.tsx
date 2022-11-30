import { Album } from "types/album";
import "./style.css";

type Props = {
  album: Album;
};

function CardAlbum({ album }: Props) {
  return (
    <>
      <a
        href={"/album-full/" + album.id}
        className="album-card"
        style={{
          background: `linear-gradient(rgba(0,0,0,.4),rgba(0,0,0,.4)), url(${album.img}) no-repeat`,
          backgroundSize: "300px",
        }}
      >
        <div className="album-card-titles">
          <h1>{album.name}</h1>
          <p>{album.artist}</p>
        </div>
      </a>
    </>
  );
}

export default CardAlbum;
