package Section01;
import java.sql.Array;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n th number) : ");
        int number = scanner.nextInt();

        int first = 0;
        int second = 1;

        for(int i = 0; i < number; i++){
            if( i == number - 1){
                System.out.print(first);
            }else{
                System.out.print(first +", ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
