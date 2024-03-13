package selma.week6;

import java.util.Arrays;

public class MaxInArray {

    public static void main(String[] args) {

        int [] numbers = {200,20,0,6,7};

       maxNumber(numbers);

    }


    public  static  void  maxNumber(int[] numbers){

        int max = numbers[0];

        for (int i = 1; i <numbers.length ; i++) {

            if(numbers[i] > max){
                max = numbers[i];


            }


        }


        System.out.println("max number = " + max);;

    }


}
