package selma.week7;

import java.util.Arrays;

public class SortArrayInDescendingOrder {
    public static void main(String[] args) {

       int[] arr = {10,20,7, 8, 90};

        System.out.println(Arrays.toString(descendingOrder(arr)));


    }


    public static int[] descendingOrder(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1 ; j++) {

                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


            }

        }

        return arr;
    }

}
