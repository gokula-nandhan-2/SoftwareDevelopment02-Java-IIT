import java.util.Scanner;

public class MarkCal{
	public static void main(String args[]){
		Scanner marks=new Scanner(System.in);
		
		System.out.print("Enter ICT marks :");
		float ICT=marks.nextFloat();
		
		System.out.print("Enter CW marks :");
		float CW=marks.nextFloat();
		
		if(ICT>=30 && CW>=30){
			float finalmark=(ICT+CW)/2;
			if(finalmark>=40){
				System.out.println("Your final mark is :"+finalmark);
				System.out.print("Module pass");
			}
			else{
				System.out.println("Your final mark is :"+finalmark);
				System.out.print("Module fail");
			}
		}
		else{
			System.out.print("Module fail");
		}
	}
} 