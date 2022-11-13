import "./style.css";

type Props = {
  img: string;
};

function CategoriesCard({ img }: Props) {
  return (
    <>
      <div className="card">
        <img src={img} alt="card" />
      </div>
    </>
  );
}

export default CategoriesCard;
