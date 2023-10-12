import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input string to lowercase for case-insensitive checking
        str = str.toLowerCase();

        // Iterate through the characters in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding alphabet as present
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all alphabets are marked as present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
}