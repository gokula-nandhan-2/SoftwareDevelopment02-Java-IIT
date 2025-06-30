import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		double num1=number.nextDouble();
		System.out.print("Enter Number 2 :");
		double num2=number.nextDouble();
		double sum=num1+num2;
		System.out.println("The Sum of the two values is :"+sum);
	}
}