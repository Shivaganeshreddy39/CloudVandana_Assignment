import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list for shuffling
        List<Integer> list = Arrays.asList(array);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the list back to an array if needed
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}
