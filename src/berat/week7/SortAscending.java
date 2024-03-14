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
}
/*
SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */