package SelfStudyExercises;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise0304 {
    public static void main(String[] args){
        try{
            double[] array = {1.3, 5.6, 2.3, 9.0};
            double[] newArray = new double[array.length];

            File file = new File("Exercise3.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for(double value:array){
                writer.write(String.valueOf(value) + " ");
            }
            writer.close();

            Scanner file_reader = new Scanner(file);
            int index = 0;
            while(file_reader.hasNextDouble() && index< array.length){
                double text = file_reader.nextDouble();
                newArray[index] = text;
                index++;
            }
            System.out.println(Arrays.toString(newArray));

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
