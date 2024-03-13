package selma.week5;

public class UniqueCharacters {

    public static void main(String[] args) {
                             //01234567891011
        uniqueCharacter("AAABBBCCCDEF");
                             //00033366691011
                            //22255588891011



    }




    
    public static void  uniqueCharacter(String string){
        
        String unique = "";


        for (int i = 0; i < string.length() ; i++) {

            char ch = string.charAt(i);

            System.out.println(string.charAt(i) + " = " + string.indexOf(ch) + " "+ string.lastIndexOf(ch));

            if (string.indexOf(ch) == string.lastIndexOf(ch)){
                unique +=ch;
            }


        }

        System.out.println(unique);
        
    }
    
    
    
}
