package berat.week7;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] ascendingdOrder = (stream(arr).sorted().toArray());

        System.out.println("ascendingdOrder = " + Arrays.toString(ascendingdOrder));

    }


}
