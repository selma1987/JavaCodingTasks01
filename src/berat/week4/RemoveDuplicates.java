package berat.week4;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("SSEELLMMAA"));

    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }
}



//Remove Duplicates
//Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC