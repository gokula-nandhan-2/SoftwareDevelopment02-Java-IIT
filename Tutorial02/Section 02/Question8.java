import java.util.Scanner;
import java.util.Random;

public class Question8 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(""" 
                ROCK - PAPER - SCISSORS
                
                Choice 0 -> Rock
                Choice 1 -> Paper
                Choice 2 -> Scissors
                
                Enter your choice : """);

        int choice = scanner.nextInt();
        int random_number = new Random().nextInt(3);
        System.out.println("Coumputers choice is " + random_number);

        if(choice == 0 && random_number == 2){
            System.out.println("Rock crushes Scissors. You win!");
        } else if(choice == 1 && random_number == 2) {
            System.out.println("Scissors cuts Paper. Computer wins!");
        }else if(choice == 1 && random_number == 0){
            System.out.println("Paper covers Rock. You win!");
        } else if (choice == random_number) {
            System.out.println("Same choice! It’s a tie.");
        }
    }
}
