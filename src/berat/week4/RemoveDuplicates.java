package berat.week4;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCCDDD"));

    }

    public static String removeDuplicates(String str) {
        String result = ""; // Boş bir sonuç stringi oluştur
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            System.out.println(result.indexOf(currentChar));
            if (result.indexOf(currentChar) == -1) {
                result += currentChar; // Sonuca ekle
            }
        }
        return result; // Sonucu döndür
    }
}



//Remove Duplicates
//Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC