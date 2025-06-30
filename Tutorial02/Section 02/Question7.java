import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your bank account balance :");
        int balance = scanner.nextInt();

        while(true){
            System.out.print("""
                Banking System
                
                1 -> Deposit
                2 -> Withdrawal
                3 -> Check for Fraud
                4 -> Exit
                
                Enter Choice : """);


            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter deposit amount : ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("Deposited! your account balance is "+ balance +"$");
            }else if(choice == 2){
                System.out.print("Enter withdrawal amount : ");
                int withdrawal = scanner.nextInt();
                balance -= withdrawal;
                System.out.println("Withdrawal successful! your account balance is "+ balance + "$");
                if(balance <= 0){
                    System.out.println("Warning: Your account is overdrawn!");
                }
            }else if(choice == 3){
                if(balance < 100){
                    System.out.println("Fraud Check: Balance below $100. Please investigate.");
                }else{
                    System.out.println("No fraud detected!");
                }
            } else if (choice == 4) {
                System.out.println("Exiting!");
                break;
            } else{
                System.out.println("Invalid Choice!");
            }
        }
    }
}
