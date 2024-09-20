
import "./bookcard.css";

const BookCard = (props) => {
  return (
    <div className="card">
      <img src={props.cover} alt={`${props.title} cover`} className="cover"/>
      <div className="info">
        <h3>{props.title}</h3>
        <p><strong>Author:</strong> {props.author}</p>
        <p>{props.description}</p>
      </div>
    </div>
  );
};

export default BookCard;