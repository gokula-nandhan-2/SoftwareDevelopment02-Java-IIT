import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Addition - 1");
		System.out.println("Subtraction - 2");
		System.out.println("Multiplication - 3");
		System.out.println("Division - 4");
		
		System.out.print("Choice :");
		int option=input.nextInt();
		
		System.out.print("Number 1 :");
		int num1=input.nextInt();

		System.out.print("Number 2 :");
		int num2=input.nextInt();
		
		int num3=0;
		
		switch(option){
			case 1:
			num3=num1+num2;
			System.out.println(num1+"+"+num2+"="+num3);
				break;
			
			case 2:
			num3=num1-num2;
			System.out.println(num1+"-"+num2+"="+num3);
				break;
				
			case 3:
			num3=num1*num2;
			System.out.println(num1+"*"+num2+"="+num3);
				break;
				
			case 4:
			num3=num1/num2;
			System.out.println(num1+"/"+num2+"="+num3);
				break;	
				
			default:
                System.out.println("Invalid choice!");
                break;
		}
	}
}









 public static void additionalOptions() {

        String subChoice = null;

        while (subChoice != "e") {
            Scanner subMenuScanner = new Scanner(System.in);
            System.out.print("""
                    \n******** ADDITIONAL OPTIONS ********
                                        
                    Choices as follows,
                                        
                    a - Add student
                    b - Add module marks
                    c - Summary of the Student Management System
                    d - Report of the students
                    e - exit
                                        
                    Enter choice :""");

            subChoice = subMenuScanner.nextLine().toLowerCase();

            switch (subChoice) {
                case "a":
                    addStudent();
                    break;
                case "b":
                    break;
                case "c":
                    break;
                case "d":
                    break;
                case "e":
                    break;
            }
        }
    }


    public static void addStudent() {
        Scanner toCheck = new Scanner(System.in);

        System.out.print("Enter student ID :");
        String checkID = toCheck.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (studentArray[i].getStudentID().equals(checkID)) {
                System.out.print("Enter student name :");
                String updatedName = toCheck.nextLine();
                studentArray[i].setStudentName(updatedName);
                System.out.print("Student name entered successfully!");
                storeDetails();
            }

        }