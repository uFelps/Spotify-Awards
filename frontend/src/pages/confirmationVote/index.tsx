import { Link } from "react-router-dom";
import "./style.css";

type Props = {
  url: string;
};

function ConfirmationVote({ url }: Props) {
  return (
    <>
      <div className="confirmation-vote">
        <div className="confirmation-vote-div">
          <h1>Thanks for Voting</h1>
          <p>Your review has been sent successfully</p>
          <Link to={url}>
            <button className="confirmation-vote-bt">Ok</button>
          </Link>
        </div>
      </div>
    </>
  );
}

export default ConfirmationVote;
