package Tutorial04.Section01;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[][] marks = new double[5][3];

        for(int i = 0; i < marks.length ; i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print("Enter marks-" + (j+1) +" : ");
                int mark = scanner.nextInt();
                marks[i][j] = mark;
            }
            System.out.println();
        }


        for(int i = 0; i < marks.length ; i++){
            int total = 0;
            for(int j = 0; j < marks[i].length; j++){
                total += marks[i][j];
            }
            int average = total/marks[i].length;
            System.out.println("Average of student "+ (i+1) +" - " + average);
        }
    }
}
