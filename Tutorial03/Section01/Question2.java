package Section01;

public class Question2 {
    public static void main(String[] Args){
        //Q1
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        //Q2
        for(int i = 2; i <= 8 ; i+=2){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        //Q3
        for (int i = 1; i <= 5; i++) {
            for(int k = i; k <= 4; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //Q4
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

}
