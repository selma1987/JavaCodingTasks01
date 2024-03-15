package berat.week7;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

     /*   int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("min = " + min);*/

        System.out.println("minNum(arr) = " + minNum(arr));


    }

    public static int minNum(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (min > each) {
                min = each;
            }

        }
        return min;
    }
}
