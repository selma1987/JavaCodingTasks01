package selma.week6;

public class String_SumOFAllDigits {

    public static void main(String[] args) {


        System.out.println(SumOfAllDigits("12java5java3"));

    }


    public static int SumOfAllDigits(String string){

        int sum = 0;

         for (char each : string.toCharArray()){


            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }



        }

       return sum;




    }



}
