package samiha.week1;

public class Finra {
    public static void FINRA(){

        String result = "";

        for (int i = 1; i <= 30 ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                result += "FINRA";
            }else if (i % 3 == 0){
                result +="FIN ";
            }else if (i % 5 == 0){
                result += "RA ";
            }else {
                result += i + " ";
            }
        }
        System.out.println(result);


    }
}
