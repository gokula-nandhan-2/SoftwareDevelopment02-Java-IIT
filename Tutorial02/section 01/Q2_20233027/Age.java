import java.util.Scanner;

public class Age{
	public static void main(String args[]){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter the Age :");
		int age=number.nextInt();
		if(age>18){
			System.out.print("Over 18");
		}
		else if(1<age && age<=18){
			System.out.print("Under 18");
		}
		else{
			System.out.print("The age entered is incorrect");
		}
	}
}