package Section02;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int passcode = 486251;
        int count = 1;
        int maxAttempt = 4;

        while (count != 5){
            System.out.print("Enter Passcode : ");
            int input = scanner.nextInt();

            if(input == passcode){
                System.out.println("Correct passcode.");
                break;
            }else{
                if (count < maxAttempt) {
                    System.out.println("Wrong passcode. Retry!");
                    System.out.println("You have " + (maxAttempt - count) + " attempt(s) left.");
                } else {
                    System.out.println("System locked!");
                }
            }
            count+=1;
        }
    }
}
