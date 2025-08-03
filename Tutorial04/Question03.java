package Tutorial04;
import java.util.Arrays;
import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] array = {1.01, 2.02, 3.03, 4.04, 5.05, 6.06, 7.07, 8.08, 9.09, 10.1};

        System.out.print("Index of value Want to swap : ");
        int i = scanner.nextInt();

        System.out.print("Index want to swap : ");
        int j = scanner.nextInt();

        if(i < array.length && j < array.length){
            double temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }else{
            System.out.println("Index out of range!");
        }
    }
}
