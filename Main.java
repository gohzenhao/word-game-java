import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static final String DICTIONARY = "dictionary.txt";

    public static void main(String[] args) {
        getSelection();
    }

    public static void getSelection() {
        System.out.println("Welcome to the Word Games program menu.");
        System.out.println("Select from one of the following options.");
        System.out.println("1. Substring problem.");
        System.out.println("2. Points problem.");
        System.out.println("3. Exit.");
        System.out.print("4. Enter your selection: ");
        Scanner in = new Scanner(System.in);
        try{
            int answer = in.nextInt();
            if(answer > 3 || answer < 1) {
                System.out.println("");
                System.out.println("Invalid option. Try again.");
                System.out.println("");
                getSelection();
            }
            switch(answer) {
                case 1:
                   substringProblem();
                   break;
                case 2:
                    pointsProblem();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
            getSelection();
        } catch (InputMismatchException ime) {
            System.out.println("");
            System.out.println("Invalid option. Try again.");
            System.out.println("");
            getSelection();
        }
    }

    public static void substringProblem() {
        System.out.println("This is substring problem.");
    }

    public static void pointsProblem() {
        System.out.println("This is points problem.");
    }
}
