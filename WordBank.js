import React, { useState } from 'react';

const WordBank = () => {
  const categories = [
    { title: 'To You', words: ['Tenacious', 'Dependable', 'Punctual'] },
    { title: 'To Me', words: ['Honest', 'Temperate', 'Loyal', 'Encouraging', 'Hardworking', 'Flexible', 'Self-controlled', 'Thorough', 'Generous', 'Wise', 'Mindful', 'A leader'] },
    { title: 'To Others', words: ['Eloquent', 'Perceptive', 'Patient', 'Funny', 'Great listener', 'Resourceful', 'Focused', 'Imaginative', 'Loving', 'Empathetic', 'Assertive', 'Professional', 'Independent', 'Ambitious', 'Caring', 'Fun', 'Fair', 'Knowledgeable', 'Courageous', 'Curious', 'Positive', 'Open-minded', 'Warm', 'Optimistic', 'Creative', 'Mentally strong', 'Unselfish', 'Faithful', 'Understanding', 'Cooperative'] },
  ];

  const [selectedWords, setSelectedWords] = useState([]);

  const handleWordToggle = (word) => {
    if (selectedWords.includes(word)) {
      setSelectedWords(selectedWords.filter((selectedWord) => selectedWord !== word));
    } else {
      if (selectedWords.length < 3) {
        setSelectedWords([...selectedWords, word]);
      } else {
        // Notify the user that they can only choose 3 words
        alert('You can only choose 3 words.');
      }
    }
  };

  return (
    <div>
      {categories.map((category, index) => (
        <div key={index}>
          <h2>{category.title}</h2>
          <ul>
            {category.words.map((word, idx) => (
              <li key={idx} onClick={() => handleWordToggle(word)} style={{ color: selectedWords.includes(word) ? 'green' : 'black', cursor: 'pointer' }}>
                {word}
              </li>
            ))}
          </ul>
        </div>
      ))}
      <div>
        <h2>Selected Words:</h2>
        <ul>
          {selectedWords.map((word, idx) => (
            <li key={idx}>{word}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default WordBank;
