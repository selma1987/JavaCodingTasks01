package berat.week6;

import java.util.Arrays;

public class String_SumOfAllDigits {
    public static void main(String[] args) {
      String str = "12 java 5 apple 3";

        String [] newStr = str.split(" ",1);
        System.out.println("newStr = " + Arrays.toString(newStr));



    }


    }

/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20

 */