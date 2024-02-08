package samiha.week2;

public class DivisibleBy3_5_15 {
    public static void DivisibleBy3_5_15(int number){

        String by15 = "", by5 = "", by3 = "";

        for(int i = 1; i <= number; i++){

            if(i % 15 == 0){
                by15 += i + " ";
            } else if(i % 5 == 0){
                by5 += i + " ";
            } else if(i % 3 == 0){
                by3 += i + " ";
            }
        }

        System.out.println("Divisible by 15: " + by15);
        System.out.println("Divisible by 5: " + by5);
        System.out.println("Divisible by 3: " + by3);

    }
}
