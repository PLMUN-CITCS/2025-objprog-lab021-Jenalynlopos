mport java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0; // Return 0 if the input is empty or only spaces
        }
        String[] words = sentence.split("\\s+"); // Split sentence based on spaces
        return words.length;
    }

    // Main method
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get sentence from user
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence contains " + wordCount + " word(s)."); // Display word count
    }
}