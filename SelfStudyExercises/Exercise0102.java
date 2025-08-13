package SelfStudyExercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise0102 {
    public static void main(String[] args){
        try{
            File file = new File("Exercise1.txt");
            boolean file_created = file.createNewFile();
            if(file_created){
                FileWriter writer = new FileWriter("Exercise1.txt");
                writer.write("This is my first file");
                writer.close();
            }
            Scanner file_reader = new Scanner(file);
            while(file_reader.hasNextLine()){
                String text = file_reader.nextLine();
                System.out.println(text);
            }

        }catch(IOException e){
            System.out.println("Error while writing to a file.");
            e.printStackTrace();
        }

    }
}
