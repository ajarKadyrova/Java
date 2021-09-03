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
        int duration = 0;
        if(end>start)
            duration = end - start;
        else 
            duration = start - end;
        if(h1 == h2 && m2 == m1){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        } //else if(h2>h1 && m1 > m2){
        //     int diff = m1 - m2;
        //     int min = 60 - diff;
        //     if(h2-h1 == 1)
        //     System.out.println("O JOGO DUROU 0 HORA(S) E "+ min +" MINUTO(S)");
        //     else
        //     System.out.println("O JOGO DUROU "+ (h2-h1) +" HORA(S) E "+ min +" MINUTO(S)");
        // }
        //if(h1 < h2 && m2 > m1) 
        // else
        //     System.out.println("O JOGO DUROU "+ (h2-h1) +" HORA(S) E "+ (m2-m1) +" MINUTO(S)");
        int dm = 0, dh = 0;
        if(duration > 60){
           dh = duration/60;
           dm = duration - (dh*60);
        } else if(duration < 60){
            dh = 0; dm = duration;
        }
        System.out.println(duration);
        System.out.println(dh);
        System.out.println(dm);
        System.out.println("O JOGO DUROU "+ dh +" HORA(S) E "+ dm +" MINUTO(S)");
    }
}