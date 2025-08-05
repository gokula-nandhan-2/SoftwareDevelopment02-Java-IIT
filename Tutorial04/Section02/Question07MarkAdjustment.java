package Tutorial04.Section02;
import java.util.Scanner;

public class Question07MarkAdjustment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        for(int i=0; i<10; i++){
            int reducedMark = 0;
            System.out.print("Enter Mark-"+(i+1)+ " : ");
            int mark = scanner.nextInt();
            reducedMark = mark - 10;
            marks[i] = reducedMark;
        }

        for(int i=0; i<10;i++){
            System.out.println("Student-" + (i+1) + " -> "+ marks[i] +" mark(s)" );
        }
    }
}
