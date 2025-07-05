package Section01;

public class Question1 {
    public static void main(String[] Args){
        //Q1
        for(int i=1 ; i<6; i++){
            System.out.println(i);
        }
        System.out.println("\n");

        int i = 1;
        while(i < 6){
            System.out.println(i);
            i+=1;
        }
        System.out.println("\n");

        //Q2
        for(int j=0; j < 15; j+=2){
            if(j == 6){
                continue;
            }System.out.println(j);
        }
        System.out.println("\n");

        int j = 0;
        while(j < 15){
            if(j == 6){
                j+=2;
                continue;
            }
            System.out.println(j);
            j+=2;
        }
    }
}
