package berat.week5;

public class StringReverse {
    public static void main(String[] args) {

       reversed("OEDYC");

    }

    public static String reversed(String str){
        String reversed="";

        for (int i = str.length()-1; i >=0; i--) {
            char each = str.charAt(i);
            reversed += each;
        }
        return reversed ;
    }


}



/*
String_Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */