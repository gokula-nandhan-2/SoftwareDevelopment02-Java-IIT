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

        //Q2
        for(int j=0; j < 15; j+=2){
            if(i == 6){
                continue;
            }System.out.println(j);

        }
    }
}
