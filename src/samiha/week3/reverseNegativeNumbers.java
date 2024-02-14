package samiha.week3;

public class reverseNegativeNumbers {

    public static void main(String[] args) {

    }
        public static int reverseInt(int n) {
            int rev = 0;

            while(n > 0){
                int lastDigit = n % 10;
                rev = rev * 10 + lastDigit;
                n /= 10;
            }
            return -rev;
        }

    }

