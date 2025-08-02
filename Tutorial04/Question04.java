package Tutorial04;

public class Question04 {
    public static void main(String[] args){
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};

        // a
        System.out.println("Solution-A");
        for(int value:array){
            if(value % 2 == 0){
                System.out.println(value);
            }
        }
        System.out.println();

        // b
        System.out.println("Solution-B");
        for(int value:array){
            int answer = value * 2;
            for(int values: array){
                if(answer == values){
                    System.out.println(value);
                }
            }
        }

    }
}
