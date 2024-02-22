package berat.week4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(haveSameLetters("arz", "zar"));


    }

    public static boolean haveSameLetters (String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();



        Arrays.sort(char1);
        Arrays.sort(char2);

       return Arrays.equals(char1,char2);

    }

}



// String - Same letters
//Write a return method that checks if a string is built out of the same letters as another string.
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false