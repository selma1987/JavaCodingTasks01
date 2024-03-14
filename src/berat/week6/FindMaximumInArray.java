package berat.week6;

import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaximumInArray {
    public static void main(String[] args) {

        int maxNr = 0;
        int[] arr = {99, 12, 23, 32, 144, 57, 6};
        for (int each : arr) {
            if (arr[0]<each) {
                 maxNr = each;
            }

        }

    /*    System.out.println("maxNr = " + maxNr);

        OptionalInt max=  Arrays.stream(arr).max();
        int maxi = max.getAsInt();
        System.out.println("maxi = " + maxi);*/


    }
        }


 /*   Write a method that can find the maximum number from an int Array
        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

        */