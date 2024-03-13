package selma.week7;

public class MinNumberInArray {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println(minNum(arr));

    }


    public static int minNum(int[] arr){
        int min = arr[0];

        for (int each : arr){
            if (each <min){
                min = each;
            }
        }

        return min;
    }


}
