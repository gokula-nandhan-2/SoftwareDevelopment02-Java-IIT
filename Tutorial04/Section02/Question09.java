package Tutorial04.Section02;

import java.util.Arrays;
import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myNamesArray = new int[10];
        int[] myNumbersArray2;

        for(int i = 0; i < myNamesArray.length; i++){
            System.out.print("Enter " + (i+1) + "th number : ");
            int value = scanner.nextInt();
            myNamesArray[i] = value;
        }

        myNumbersArray2 = myNamesArray;

        int minIndex, temp;
        for (int start = 0; start < myNumbersArray2.length- 1; start++) {
            minIndex = start;
            for (int i = start + 1; i <= myNumbersArray2.length - 1; i++) {
                if (myNumbersArray2[i] < myNumbersArray2[minIndex]) {
                    minIndex = i;
                }
            }
            temp = myNumbersArray2[start];
            myNumbersArray2[start] = myNumbersArray2[minIndex];
            myNumbersArray2[minIndex] = temp;
        }
        System.out.println(Arrays.toString(myNumbersArray2));

    }
}
