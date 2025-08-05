package Tutorial04.Section02;
import java.util.Random;

public class Exercise06 {
    public static void main(String[] args){
        Random random = new Random();
        int countX = 0;
        int countY = 0;
        int countXY = 0;

        for(int i=0; i < 1000; i++){
            int x = random.nextInt(6) + 1;
            int y = random.nextInt(6) + 1;

            if(x==4 && y==4){countXY++;}
            if(x==4){countX++;}
            if(y==4){countY++;}
        }
        System.out.println("Estimated P(X=4): " + ((double)countX/1000));
        System.out.println("Estimated P(Y=4): " + ((double)countY/1000));
        System.out.println("Estimated P(X=4 and Y=4): " + ((double)countXY/1000));
    }
}
