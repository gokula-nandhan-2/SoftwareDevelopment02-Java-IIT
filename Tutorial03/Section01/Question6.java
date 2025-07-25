package Section01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("Addition       - 1");
            System.out.println("Subtraction    - 2");
            System.out.println("Multiplication - 3");
            System.out.println("Division       - 4");
            System.out.println("Exit           - 0");

            System.out.print("Choice : ");
            int choice;

            try {
                choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting calculator. Goodbye!");
                    break; // Exit the loop
                }

                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice! Please enter 1-4.");
                    continue; // Start next loop iteration
                }

                System.out.print("Number 1: ");
                int number1 = scanner.nextInt();

                System.out.print("Number 2: ");
                int number2 = scanner.nextInt();

                int result;

                switch (choice) {
                    case 1:
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;
                    case 2:
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;
                    case 3:
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;
                    case 4:
                        if (number2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = number1 / number2;
                            System.out.println(number1 + " / " + number2 + " = " + result);
                        }
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter only numbers.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}
