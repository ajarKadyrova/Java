import java.util.*;

public class Combiner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++){
            String[] words = input.nextLine().split(" ");
            String str1 = words[0];
            String str2 = words[1];

            System.out.println(str1 + " " + str2);

            int shortWord = Math.min(str1.length(), str2.length());
            String longWord = (str1.length() > str2.length()) ? str1 : str2;
            String res = "";
            for (int j = 0; j < shortWord; j++) {
                res += str1.charAt(j);
                res += str2.charAt(j);
            }
            res += longWord.substring(shortWord);
            System.out.println(res); 
            
        }
        input.close();
    }
}
