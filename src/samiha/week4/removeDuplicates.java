package samiha.week4;

public class removeDuplicates {

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += each;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));
    }

    }
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */

