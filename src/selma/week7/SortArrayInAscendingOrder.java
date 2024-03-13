package selma.week7;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {

        int[]arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(ascendingOrder(arr)));

    }

    public static int [] ascendingOrder(int[]arr){

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length -1 ; j++) {

                if(arr[j] > arr[j + 1]){  //
                    int tem = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = tem;
                }

                System.out.println(Arrays.toString(arr));

            }

        }


      return arr;

    }


}
