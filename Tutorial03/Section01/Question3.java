package Section01;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a letter : ");
        String letter = scanner.nextLine();
        String output = "";

        for(int i = 0; i < num; i++){
            output += letter;
        }
        System.out.println("output : " + output);
    }
}
