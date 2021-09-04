import java.util.Locale;
import java.util.Scanner;

public class GameTime {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        input.close();
        int start = h1 * 60 + m1;
        int end = h2 * 60 + m2;
        int duration = end - start;
        if(duration > 0){
            System.out.println("O JOGO DUROU "+ (duration/60) +" HORA(S) E "+ (duration%60) +" MINUTO(S)");
        }
        else if(duration < 0){
            System.out.println("O JOGO DUROU "+ ((24 * 60 + duration) / 60) +" HORA(S) E "+ ((24 * 60 + duration) % 60) +" MINUTO(S)");
        }
        else if(duration == 0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        }
    }
}