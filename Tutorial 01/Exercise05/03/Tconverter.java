import java.util.*;

public class Tconverter{
	public static void main(String[] args){
		Scanner temp=new Scanner(System.in);
		System.out.print("Enter temperature in Centigrade :");
		int C=temp.nextInt();
		double F= (9.0/5)*C+32;
		System.out.println(F +" Fahrenheits");
	}
}