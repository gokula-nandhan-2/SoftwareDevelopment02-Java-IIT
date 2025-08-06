package Tutorial04.Section02;

import java.util.Arrays;
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for(int i=0; i < size; i++){
            System.out.print("Enter the " + (i+1) + "th number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }

        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}
