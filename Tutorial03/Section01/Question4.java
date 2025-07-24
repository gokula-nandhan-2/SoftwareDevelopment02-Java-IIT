package Section01;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int tot = 1;
        String format = "";

        if(num >= 0){
            if(num == 0){
                System.out.println("Factorial of " + num + " is " + 1 +".");
            }else{
                for(int i = num; i >= 1 ; i--){
                    tot *= i ;
                    if(i == 1){
                        format += String.valueOf(i);
                    }else{
                        format += String.valueOf(i) + " x ";
                    }
                }
                System.out.print("Factorial of " + num + " = " + format +" = " + tot +".");
            }

        }else{
            System.out.println("Invalid Input!");
        }
    }
}
