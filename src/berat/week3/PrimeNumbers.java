package berat.week3;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(isPrime(7));


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
           if (number%i==0) {
               return false;
           }
        }
        return true;
    }
}
//Write a method that can check if a number is prime or not