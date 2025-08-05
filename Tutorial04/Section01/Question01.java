package Tutorial04.Section01;
import  java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks : ");
            int mark = scanner.nextInt();
            array[i] = mark;
        }

        for(int marks : array){
            System.out.println(marks);
        }


        int sum = 0;
        int count = 0;
        for(int marks : array){
            if(marks < 40){
                count++;
            }
            sum += marks;
        }
        int average = sum / array.length;

        System.out.println("Student count of failed : " + count);
        System.out.println("Average Marks : " + average);
    }
}
