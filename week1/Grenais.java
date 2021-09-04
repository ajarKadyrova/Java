import java.util.*;

public class Grenais {
    public static void main (String[] args){
        int cnt = 0, cntInter = 0, cntGremio = 0, f = 1, draw = 0;
        int inter, gremio;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        while(f == 1){
            inter = input.nextInt();
            gremio = input.nextInt();
            cnt++;
            if(inter>gremio) cntInter++;
            else if(inter<gremio) cntGremio++;
            else if(inter == gremio) draw++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            f = input.nextInt();
        }
        System.out.println(cnt + " grenais");
		System.out.println("Inter:" + cntInter);
		System.out.println("Gremio:" + cntGremio);
		System.out.println("Empates:" + draw);
		if (cntInter > cntGremio) System.out.println("Inter venceu mais");
		else if (cntGremio > cntInter) System.out.println("Gremio venceu mais");
		else System.out.println("Nao houve vencedor");
    }
}
