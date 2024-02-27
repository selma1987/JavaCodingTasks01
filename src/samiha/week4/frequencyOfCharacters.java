package samiha.week4;

public class frequencyOfCharacters {
    public static String frequencyOfChars(String str) {
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if (!result.contains("" + ch)) {
                result += ch;
                result += count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "aabcccd";
        System.out.println(frequencyOfChars(str));
    }
    }



//Write a return method that can find the frequency of characters
//  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
