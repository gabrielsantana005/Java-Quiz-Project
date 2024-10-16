import java.util.Scanner;

public class Questions {

    /* Each method takes care of printing the actual test and answer choice as well as taking care of verifying
       whether the user has input the correct answer.  */

    public Integer question1(Scanner scnr) {

        System.out.println("Question 1:");
        System.out.println("What is a defining characteristic of Java?");

        System.out.println("A) Java is a platform-dependent language.");
        System.out.println("B) Java allows direct memory manipulation.");
        System.out.println("C) Java supports object-oriented programming.");
        System.out.println("D) Java does not support multithreading.");

        char correctAnswer = 'C';
        char userAnswer = scnr.next().charAt(0); // Use the passed Scanner object

        // Makes it to that it accepts if the correct answer is entered as a lowercase.
        if (Character.toUpperCase(userAnswer) == correctAnswer) {
            System.out.println("Good job, that is correct!");
            return 1;
        } else {
            System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            return 0;
        }
    }

    public Integer question2(Scanner scnr) {
        System.out.println("Question 2:");
        System.out.println("Which of the following is not a valid Java access modifier?");

        System.out.println("A) public");
        System.out.println("B) private");
        System.out.println("C) protected");
        System.out.println("D) internal");

        char correctAnswer = 'D';
        char userAnswer = scnr.next().charAt(0);  // Use the passed Scanner object

        // Makes it to that it accepts if the correct answer is entered as a lowercase.
        if (Character.toUpperCase(userAnswer) == correctAnswer) {
            System.out.println("Good job, that is correct!");
            return 1;
        } else {
            System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            return 0;
        }
    }

    public Integer question3(Scanner scnr) {
        System.out.println("Question 3:");
        System.out.println("Which of the following is a primitive data type in Java?");

        System.out.println("A) String");
        System.out.println("B) int");
        System.out.println("C) ArrayList");
        System.out.println("D) Scanner");

        char correctAnswer = 'B';
        char userAnswer = scnr.next().charAt(0);

        if (Character.toUpperCase(userAnswer) == correctAnswer) {
            System.out.println("Good job, that is correct!");
            return 1;
        } else {
            System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            return 0;
        }
    }

    public Integer question4(Scanner scnr) {
        System.out.println("Question 4:");
        System.out.println("Which of the following is not a Java keyword?");

        System.out.println("A) static");
        System.out.println("B) volatile");
        System.out.println("C) include");
        System.out.println("D) synchronized");

        char correctAnswer = 'C';
        char userAnswer = scnr.next().charAt(0);

        if (Character.toUpperCase(userAnswer) == correctAnswer) {
            System.out.println("Good job, that is correct!");
            return 1;
        } else {
            System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            return 0;
        }
    }

    public Integer question5(Scanner scnr) {
        System.out.println("Question 5:");
        System.out.println("Which of the following is used to terminate a loop in Java?");

        System.out.println("A) break");
        System.out.println("B) continue");
        System.out.println("C) exit");
        System.out.println("D) return");

        char correctAnswer = 'A';
        char userAnswer = scnr.next().charAt(0);

        if (Character.toUpperCase(userAnswer) == correctAnswer) {
            System.out.println("Good job, that is correct!");
            return 1;
        } else {
            System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            return 0;
        }
    }
}