package Tutorial04.Section02;

import java.util.Arrays;

public class Question1011 {
    public static void main(String[] args){

        // Question 10
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        // passed by reference
        System.out.println(array);
        // get values
        System.out.println(Arrays.toString(array));
        System.out.println("Arrays behave like they're passed by reference, but technically they are passed by value of the reference.");

        // Question 11
        int[] array1 = {10, 5, 3, 8, 2, 1, 7, 9};
        int[] result = removeBadPairs(array1);
        System.out.println(Arrays.toString(result));
    }


    public static int[] removeBadPairs(int[] array) {
        int[] temp = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] <= array[i + 1]) {
                temp[index++] = array[i];
                temp[index++] = array[i + 1];
            }
        }

        return Arrays.copyOf(temp, index);
    }
}
