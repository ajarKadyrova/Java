import java.util.*;

public class BanknotesCoins {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double  num = input.nextDouble();
        input.close();
        int banknote = (int)num;
        int coin = (int) ((num - (int)num)*100);

        System.out.println("NOTAS:");
        System.out.println((banknote / 100) + " nota(s) de R$ 100.00");
        banknote %=100; 
        System.out.println((banknote / 50) + " nota(s) de R$ 50.00");
        banknote %= 50;
        System.out.println((banknote / 20) + " nota(s) de R$ 20.00");
        banknote %= 20;
        System.out.println((banknote / 10) + " nota(s) de R$ 10.00");
        banknote %= 10;
        System.out.println((banknote / 5) + " nota(s) de R$ 5.00");
        banknote %= 5;
        System.out.println((banknote / 2) + " nota(s) de R$ 2.00");
        banknote %= 2;

        System.out.println("MOEDAS:");
        System.out.println(banknote + " moeda(s) de R$ 1.00");
        System.out.println(coin / 50 + " moeda(s) de R$ 0.50");
        coin %= 50;
        System.out.println(coin / 25 + " moeda(s) de R$ 0.25");
        coin %= 25;
        System.out.println(coin / 10 + " moeda(s) de R$ 0.10");
        coin %= 10;
        System.out.println(coin / 5 + " moeda(s) de R$ 0.05");
        coin %= 5;
        System.out.println(coin + " moeda(s) de R$ 0.01");

        // double[] banknotes = new double[]{100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        // double[] coins = new double[]{1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        
        // System.out.println("NOTAS:");
        // double banknote = 0;
        // for(int i = 0; i < banknotes.length; i++){
        //     banknote = num/banknotes[i];
        //     num %= banknotes[i];
        //     System.out.println((int)banknote + " nota(s) de R$ " + banknotes[i]);
        // }
        // System.out.println(num);
        // System.out.println("MOEDAS:");
        //  for(int i = 0; i < coins.length; i++){
        //     banknote = num/coins[i];
        //     num %= coins[i];
        //     System.out.println((int)banknote + " moeda(s) de R$ " + coins[i]);
        // }
    }
}
