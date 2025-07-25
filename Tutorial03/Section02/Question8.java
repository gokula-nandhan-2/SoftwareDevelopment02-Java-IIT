package Section02;
import java.util.Scanner;
import java.util.Random;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randNum = random.nextInt(20) + 1;
        int guess = 0;

        while (randNum != guess) {
            System.out.print("Enter your guess :");
            guess = scanner.nextInt();
            if (randNum > guess) {
                System.out.println("Too small!");
            } else if(randNum < guess){
                System.out.println("Too High!");
            }else{
                System.out.println("You guessed!");
            }
        }
    }
}
