"use client";
import React, { useEffect, useState } from 'react';
import BookCard from './Components/bookcard';

const Home = () => {
  const [books, setBooks] = useState([]);
  function getBooks() {
    fetch('localhost:25000/books')
      .then((r) => r.json())
      .then((f) => {
        console.log(f);
        setBooks(f);
      });
  }

  useEffect(getBooks, []);

  return (
    <div className = "container">
      <h1>Book List</h1>
      <div className="grid">
      {books.map((book) => (
          <BookCard
            title={book.title}
            author={book.author}
            description={book.description}
            cover={book.cover}
          />
        ))}
      </div>
    </div>
  );
};

export default Home;
