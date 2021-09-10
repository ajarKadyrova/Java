import java.util.*;

public class CompareSubstring {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String word1 = input.nextLine();
            String word2 = input.nextLine();

            String minWord, maxWord;
            if (word1.length() > word2.length()) {
                maxWord = word1;
                minWord = word2;
            } else{
                maxWord = word2;
                minWord = word1;
            }
            int result = minWord.length();
            boolean check = true;
            while (result > 0 && check) {
                int diff = minWord.length() - result;
                for (int i = 0; i <= diff; i++) {
                    if (maxWord.contains(minWord.substring(i, i + result))) {
                        check = false;
                        result++;
                        break;
                    }
                }
                result--;
            }
            System.out.println(result);
        }
        input.close();
    }
}
