package samiha.week2;

public class ConsecutiveNumbers {
    public static void ConsecutiveNumbers(int n){

        for(int i = 1; i <= n; i++){
            String result = "";

            if(i % 2 == 0){
                result += "Codility";
            }
            if(i % 3 == 0){
                result += "Test";
            }
            if(i % 5 == 0){
                result += "Coders";
            }if(result.isEmpty()){
                System.out.println(i);
            }else {
                System.out.println(result);
            }
        }

    }
}
