import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);
    static double firstNumber = 0;
    static double secondNumber = 0;
    public static void main(String[] args) {
        System.out.println("Enter your name");
        System.out.println("Hello " + s.nextLine());
        System.out.println("----------------------");

        System.out.println("What do you want to do?");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division\nOthers.Quit");
        if (s.hasNextInt()) {
            int input = s.nextInt();
            if (input == 1) {
                userInput();
                System.out.println("The answer of "+ firstNumber + " + "+ secondNumber + " is " + (firstNumber + secondNumber));
            } else if (input == 2) {
                userInput();
                System.out.println("The answer of "+ firstNumber + " - "+ secondNumber + " is " + (firstNumber - secondNumber));
            } else if (input == 3) {
                userInput();
                System.out.println("The answer of "+ firstNumber + " * "+ secondNumber + " is " + (firstNumber * secondNumber));
            } else if (input == 4) {
                userInput();
                System.out.println("The answer of "+ firstNumber + " / "+ secondNumber + " is " + (firstNumber / secondNumber));
            } else {
                System.out.println("Finish");
                System.exit(0);
            }
        }else {
            System.out.println("Finish");
            System.exit(0);
        }
    }

    public static void userInput() {
        System.out.println("Enter first number");
        if (s.hasNextDouble()) {
            firstNumber = s.nextDouble();
        }else {
            System.out.println("Finish");
            System.exit(0);
        }

        System.out.println("Enter second number");
        if (s.hasNextDouble()) {
            secondNumber = s.nextDouble();
        }else {
            System.out.println("Finish");
            System.exit(0);
        }
    }
}
