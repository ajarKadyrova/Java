import java.util.*;

public class LogSequence {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int x = input.nextInt();
        int y = input.nextInt();
		input.close();

        for(int i = 1; i<=y; i++){
            System.out.print(i);
            if(i%x == 0){
                System.out.println("");
            } else System.out.print(" ");
        }
    }
}
