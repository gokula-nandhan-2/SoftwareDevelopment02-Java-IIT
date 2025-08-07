package Tutorial04.Section02;

import java.util.Arrays;

public class Question12 {
    public static void main(String[] args){
        int[] array = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
        int[] result = removeBadPairs(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeBadPairs(int[] array) {
        int size = array.length;
        int[] temp = new int[size];
        int index = 0;

        if(size % 2 == 1){
            size -= 1;
        }

        for (int i = 0; i < size - 1; i += 2) {
            if (array[i] <= array[i + 1]) {
                temp[index++] = array[i];
                temp[index++] = array[i + 1];
            }
        }
        return Arrays.copyOf(temp, index);
    }
}
