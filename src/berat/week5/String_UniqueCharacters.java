package berat.week5;

public class String_UniqueCharacters {
    public static void main(String[] args) {

      uniqueChars("BCCCDDEFFRATHHH");

    }

    public static String uniqueChars(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each)==str.lastIndexOf(each)) {
                unique += each;
            }
        }
        return unique;
    }


}
/*
  String_UniqueCharacters
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


  String_Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA

2

 */