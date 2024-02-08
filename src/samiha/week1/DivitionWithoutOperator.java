package samiha.week1;

public class DivitionWithoutOperator {
    public static void divide(int n1, int n2){

        int count = 0;

        String result = n1 + "/" + n2 + " = ";

        while (n1 >= n2){
            n1 -= n2;
            count++;
        }
        System.out.println(result + count + " with remainder " + n1);
    }
}
