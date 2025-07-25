package Section02;
import java.util.*;
import java.io.*;

public class Question10 {
    public static void main(String[] args){
        int number, power;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        number = input.nextInt();
        System.out.print("Enter power : ");
        power = input.nextInt();
        int count = 0;
        while(count < power){
            total *= number;
            count++;
        }
        System.out.println("The answer is " + total);
    }
}
