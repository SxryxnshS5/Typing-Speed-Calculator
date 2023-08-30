import java.util.Scanner;

/**
 * @author Suryansh Singh
 */

public class TypingSpeedCalculator {
    public static void main(String[] args) {

        // Define the text for the user to type
        String textToType = """
                 As I sit in my room late at night, staring at the computer screen, I decide it\s
                 would be a good idea to create this text. There isn't much meaning to it, other\s
                 than to get some simple practice. A lot of the texts that have been created are\s
                 rather short, and don't give a good representation of actual typing speed and\s
                 accuracy. They lack the length to gauge where your strengths and weaknesses\s
                 are when typing.\
                """;
        // Display instructions for the user
        System.out.println("---------------------------------------------------");
        System.out.println("!! You are supposed to type the paragraph given below: !!");
        System.out.println("---------------------------------------------------");
        System.out.println(textToType);
        System.out.println(" ");
        System.out.println("!! INSTRUCTIONS !!");
        System.out.println("---------------------------------------------------------");
        System.out.println("----------Get ready, hit ENTER and start typing----------");
        System.out.println("--------Press ENTER after completing the paragraph------- \n " +
                "----------or whenever you want to stop----------");
        System.out.println("---------------------------------------------------------");

        // Wait for the user to start
        waitForEnter();

        System.out.println("------------------------------------------------");
        System.out.println("----------------Start typing now----------------");
        System.out.println("------------------------------------------------");

        // Record the start time
        long startTime = System.currentTimeMillis();

        // Prompt the user to start typing and record the typed text
        System.out.println("Start typing>>>>");
        String typedText = getUserInput();

        // Record the end time and calculate elapsed time
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        // Calculate the number of words typed
        int wordsTyped = typedText.split("\\s+").length;

        // Calculate typing speed
        double typingSpeed = calculateTypingSpeed(wordsTyped, elapsedTime);

        // Display results
        System.out.println("Time taken: " + elapsedTime + " milliseconds");
        System.out.println("Words Typed: " + wordsTyped);
        System.out.println("Typing Speed: " + typingSpeed + " words per minute");

    }

    // Method to wait for user to press Enter
    public static void waitForEnter() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    // Method to get user's typed input
    public static  String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Method to calculate typing speed in words per minute
    public static double calculateTypingSpeed(int wordsTyped, long elapsedTime) {
        double minutes = elapsedTime/60000.0; //Converts milliseconds to minutes
        return wordsTyped/minutes;
    }

}