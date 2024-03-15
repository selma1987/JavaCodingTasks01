package berat.week4;

import java.util.Arrays;
import java.util.Collections;

public class StringFrequencyOfChars {
    public static void main(String[] args) {

        System.out.println(frequency("aabbccddd"));

    }

    public static String frequency(String str) {
        String result = "";     // a3b4c5

        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        return result;
    }

}
//Write a return method that can find the frequency of characters
//  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

/*
Java Coding Tasks - Week4

  String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false


  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */