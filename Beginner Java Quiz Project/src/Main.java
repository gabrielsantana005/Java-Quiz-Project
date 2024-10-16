import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is a basic Java quiz.");
        System.out.println("You'll be given 5 multiple choice questions pertaining to Java.");
        System.out.println("Are you ready? (Y/N)");

        Scanner scnr = new Scanner(System.in); // Creates the Scanner object.

        char areYouReady = scnr.next().charAt(0); // The user inputs whether to continue or close the program.

        if (Character.toUpperCase(areYouReady) == 'N') {
             System.exit(1);
        } // If the user types 'N' the program will close.

        Questions questions = new Questions(); // Here is the created instance of the Questions class.

        List<Function<Scanner, Integer>> questionMethods = new ArrayList<>();
        questionMethods.add(questions::question1);
        questionMethods.add(questions::question2);
        questionMethods.add(questions::question3);
        questionMethods.add(questions::question4);
        questionMethods.add(questions::question5);
        // Add more questions as needed.

        int userScore = 0; // Initialize a variable to keep track of how many questions were answered correctly.
        int totalQuestions = questionMethods.size();
        // Initialize a variable that will keep track of how many questions are in the questionMethods list.

        for (Function<Scanner, Integer> questionMethod : questionMethods) {
            userScore += questionMethod.apply(scnr);
            // Takes what the method returns and either increments userScore or does nothing.
        }

        System.out.println("Your score is " + userScore + " out of " + totalQuestions + ".");
    }
}