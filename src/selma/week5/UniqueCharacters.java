package selma.week5;

public class UniqueCharacters {

    public static void main(String[] args) {

        uniqueCharacter("AABBCDDERF");
    }


    
    
    public static void  uniqueCharacter(String string){
        
        String unique = "";


        for (int i = 0; i < string.length() ; i++) {

            char ch = string.charAt(i);

            if (string.indexOf(ch) == string.lastIndexOf(ch)){
                unique +=ch;
            }


        }

        System.out.println(unique);
        
    }
    
    
    
}
