import java.util.Scanner;

public class WageBill{
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);

        int perManual=500;
        int perSkilled=700;
        int perManagement=800;

        System.out.print("Enter number of manual people :");
        int manualPeople=scanner.nextInt();

        System.out.print("Enter number of skilled people :");
        int skilledPeople=scanner.nextInt();

        System.out.print("Enter number of management people :");
        int managementPeople=scanner.nextInt();
    
        int totalWage=(perManual*manualPeople)+(perSkilled*skilledPeople)+(perManagement*managementPeople);
        double wageTax=0.2*totalWage;

        System.out.print("Total wage bill for the week is :"+ totalWage);
        System.out.print("\n Wage tax for the week is :"+ wageTax);
    }
}
