package questions.week1;

public class OddOrEven {

    public static void evenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }

    public static void main(String[] args) {

        evenOrOdd(6);


    }


}
