package SelfStudyExercises;

import java.io.*;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args){
        int[][] array = new int[4][8];
        try{
            Scanner file_reader = new Scanner(new File("Exercise5.txt"));
                for(int i = 0; i < array.length; i++){
                    for(int j = 0; j < array[i].length; j++){
                        int number = file_reader.nextInt();
                        array[i][j] = number;
                    }
                }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
