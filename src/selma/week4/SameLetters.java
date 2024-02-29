package selma.week4;

import java.util.Arrays;


public class SameLetters {
    public static void main(String[] args) {

        System.out.println(haveSameLetters("aab","bba"));

        String str1= "aaasssvvdvvffvd";

        char[] charArray1 = str1.toCharArray();

        System.out.println(Arrays.toString(charArray1));





    }


    public static boolean haveSameLetters(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();




        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);



        return  Arrays.equals(charArray1,charArray2);





    }
}
