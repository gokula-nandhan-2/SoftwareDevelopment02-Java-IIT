import java.util.*;

public class Lconverter{
	public static void main(String[] args){
		Scanner number=new Scanner(System.in);
		System.out.print("Enter value in meter(s) :");
		int m=number.nextInt();
		int cm= m*100;
		System.out.print(cm +" Centimeter(s)");
	}
}