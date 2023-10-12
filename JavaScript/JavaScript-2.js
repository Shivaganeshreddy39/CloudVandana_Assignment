// Function to sort an array in descending order
function sortDescending(arr) {
  return arr.sort(function (a, b) {
    return b - a;
  });
}

// Prompt the user for dynamic input
const input = prompt("Enter elements of the array, separated by spaces:");
if (input) {
  const inputArray = input.split(" ").map(Number);

  if (inputArray.every(Number.isFinite)) {
    const sortedArray = sortDescending(inputArray);
    console.log("Sorted Array (Descending Order):", sortedArray);
  } else {
    console.log("Please enter a valid array of numbers.");
  }
} else {
  console.log("No input provided.");
}
