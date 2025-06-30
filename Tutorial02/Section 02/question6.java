public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        int total_classes = sc.nextInt();
        System.out.println("Classes attended: ");
        int classes_attended = sc.nextInt();

        percentage = (classes_attended / total_classes) * 0.01;

        if(percentage >= 75){
            System.out.println("Allowed to sit in exam");
        }else{
            System.out.println("Not allowed to sit in exam");
        }
    }
}