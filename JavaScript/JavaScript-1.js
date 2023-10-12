function reverseWordsInSentence(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

// Use the prompt function to get user input
const inputSentence = prompt("Enter a sentence to reverse the words:");

if (inputSentence !== null) {
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log("Reversed Sentence:", reversedSentence);
} else {
  console.log("No input provided.");
}
