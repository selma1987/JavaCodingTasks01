package selma.week5;

public class Reverse_String {

    public static void main(String[] args) {

        reverseString("selma");
    }




    public static void reverseString(String string){

        String reverse = "";

        for (int i =string.length()-1;  i >= 0 ; i--) {

            char ch = string.charAt(i);

            reverse += ch;

        }


        System.out.println(reverse);



    }


}
