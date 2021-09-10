import java.util.*;

public class Huahahahaha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        String vowels = "";
        for(int i = 0; i < word.length(); i++)
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                vowels += word.charAt(i);
    
        boolean funny = true;
        for(int i = 0, j = vowels.length() - 1; i < vowels.length() / 2; i++, j--){
            if(vowels.charAt(i) != vowels.charAt(j)) {
                funny = false;
                break;
                
            }
        }
        if(funny == true){
            System.out.println("S");    
        } else System.out.println("N");  
            
    }
}
