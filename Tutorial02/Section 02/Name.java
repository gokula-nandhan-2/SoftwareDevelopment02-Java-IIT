import java.util.*;

public class Name{
	public static void main(String[] args)
	{
		Scanner Sname=new Scanner(System.in);
		System.out.print("Insert name :");
		String name=Sname.next();
		System.out.print("Insert surname :");
		String surname=Sname.next();
		System.out.println(name.substring(0,1)+surname.substring(0,1));
	}
}