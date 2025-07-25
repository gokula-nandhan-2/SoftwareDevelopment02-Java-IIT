import java.util.Scanner;

public class Grade{
	public static void main(String args[]){
		Scanner score=new Scanner(System.in);
		System.out.print("Enter your score :");
		float marks=score.nextFloat();
		
		if(marks > 100 || marks < 40){
			System.out.print("Invalid value");
		}
		else if(marks >= 70){
			System.out.print("1st Class Honours(1)");
		}
		else if(marks >= 60){
		System.out.print("2nd Class Honours Upper Division(2:i)");
		}
		else if(marks >= 50){
		System.out.print("2nd Class Honours Lower Division(2:ii)");
		}
		else{
			System.out.print("3rd Class Honours(3)");
		}
	}
	
}