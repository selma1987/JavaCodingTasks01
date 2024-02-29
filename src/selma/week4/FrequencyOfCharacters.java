package selma.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {


    public static void main(String[] args) {



    frequencyOfCharacters2("AAABBBBBCCDDE");

    frequencyOfCharacters("aabbccddaaabbccddd");


    }


   public static void frequencyOfCharacters(String str){

        String result = "";                      //AAABBCCCCDDDEE  A3B2C4D3E2


       // first step convert String to the Array by using split method
       // create for each loop to get each character
       //using collection frequency method to get frequency
       // converting  String Array in collection type

        for(String each : str.split("")){


            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            if(!result.contains(each)){
                result += each + frequency;
            }



        }

       System.out.println(result);

   }


    public static void frequencyOfCharacters2(String str) {

        String result = "";


        for (int j = 0; j < str.length() ; j++) {

            char ch  = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length() ; i++) {

                if(str.charAt(i) == ch){
                    count ++;
                }

            }

            if (result.contains(""+ch)){
                continue;
            }
            result += ch + "" + count;

        }


        System.out.println(result);





    }














}





