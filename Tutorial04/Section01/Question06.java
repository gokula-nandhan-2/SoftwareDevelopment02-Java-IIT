package Tutorial04.Section01;

public class Question06 {
    public static void main(String[] args){
        int [] runs = {05, 12, 28, 34, 47, 52, 65, 71, 80, 99};
        int searchValue = 47;
        int low = 0;
        int high = runs.length - 1;
        int mid = (low + high) / 2;

        while(low <= high && runs[mid] != searchValue){
            if(runs[mid] < searchValue){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            mid = (low + high) / 2;

        }

        if (low > high) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Match Number found in index: " + mid);
            System.out.println("Match Number: " + (mid+1));
        }
    }
}
