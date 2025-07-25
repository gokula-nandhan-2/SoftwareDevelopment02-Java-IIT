package Section02;

public class Question9 {
    public static void main(String[] args){
        for(int i = 1; i <= 500; i++){
            int exponent = String.valueOf(i).length();
            int sum = 0;
            int number = i;

            while(number > 0){
                int base = number % 10;
                sum += (int)Math.pow(base,exponent);
                number/=10;
            }
            if(sum == i){
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
