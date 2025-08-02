package Tutorial04;
import java.util.Arrays;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};

        System.out.print("Enter the index of the value you want to swap : ");
        int want_to_swap = scanner.nextInt();

        System.out.print("Enter the index you want to swap : ");
        int swap = scanner.nextInt();

        String temp = array[swap];
        array[swap] = array[want_to_swap];
        array[want_to_swap] = temp;

        System.out.println(Arrays.toString(array));

    }

}
