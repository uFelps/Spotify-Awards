import "./style.css";

type Props = {
    url: string;
}

function ButtonEvaluate({url} : Props) {
  return (
    <>
      <a href={url}>
        <button className="bt">Evaluate</button>
      </a>
    </>
  );
}

export default ButtonEvaluate;
