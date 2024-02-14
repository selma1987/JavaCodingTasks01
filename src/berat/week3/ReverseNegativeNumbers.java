package berat.week3;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {


        System.out.println(reversedNeg(-50));

    }


   /* public static int reverseNeg(int number) {



        int tensDigit = number / 10;
        int unitsDigit = number % 10;

        int result = unitsDigit * 10 + tensDigit;
        return result;
    }*/

    public static int reversedNeg(int nr) { //1234
        int rev = 0;

        while (nr < 0) { //1234
            int lastDigit = nr % 10;

            rev = rev * 10 + lastDigit;
            nr /= 10;

        }
        return rev;

    }
}


//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53