import "./style.css";

type Props = {
    url: string;
}

function ButtonVote({url} : Props) {
  return (
    <>
      <a href={url} className="link">
        <button className="bt">Vote</button>
      </a>
    </>
  );
}

export default ButtonVote;
