import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        int total_classes = sc.nextInt();
        System.out.println("Classes attended: ");
        int classes_attended = sc.nextInt();

        double percentage = ((double)classes_attended / total_classes) * 100;
        System.out.println("Attendance Percentage :" + percentage + "%");

        if(percentage >= 75){
            System.out.println("Allowed to sit in exam");
        }else{
            System.out.println("Did you have any medical causes(y or n): ");
            String ans = sc.next();
            if(ans.equals("y")){
                System.out.println("Allowed to sit in exam");
            }else{
                System.out.println("Not allowed to sit in exam");
            }
        }
    }
}