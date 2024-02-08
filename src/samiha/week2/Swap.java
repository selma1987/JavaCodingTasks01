package samiha.week2;

public class Swap {
    public static void Swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
