import java.util.*;

public class BanknotesCoins {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double num = input.nextDouble();
        input.close();
        
        // int hundred=0, fifty = 0, twenty = 0, ten =0, five = 0, two = 0, one = 0;
        // int cents50, cents25, cents10, cents5, cent1;
        // double cents = (num -(int)num);
		// hundred = (int)num/100;
		// num %= 100;
        // fifty = (int)num/50;
		// num %= 50;
        // twenty = (int)num/20;
		// num %= 20;
        // ten = (int)num/10;
		// num %= 10;
        // five = (int)num/5;
		// num %= 5;
        // two = (int)num/2;
		// num %= 2;
        // one = (int)num/1;
		// num %= 1;

        // cents50 = (int)(cents/0.50);
		// cents %= 0.50;
        // cents25 = (int)(cents/0.25);
		// cents %= 0.25;
        // cents10 = (int)(cents/0.10);
		// cents %= 0.10;
        // cents5 = (int)(cents/0.05);
		// cents %= 0.05;
        // cent1 = (int)(cents/0.01);
		// cents %= 0.01;

        // System.out.println("NOTAS:");
		// System.out.println(hundred + " nota(s) de R$ 100.00");
        // System.out.println(fifty + " nota(s) de R$ 50.00");
        // System.out.println(twenty + " nota(s) de R$ 20.00");
        // System.out.println(ten + " nota(s) de R$ 10.00");
        // System.out.println(five + " nota(s) de R$ 5.00");
        // System.out.println(two + " nota(s) de R$ 2.00");
        
		// System.out.println(cents);

        // System.out.println("MOEDAS:");
        // System.out.println(one + " nota(s) de R$ 1.00");
        // System.out.println(cents50 + " moeda(s) de R$ 0.50");
        // System.out.println(cents25 + " moeda(s) de R$ 0.25");
        // System.out.println(cents10 + " moeda(s) de R$ 0.10");
        // System.out.println(cents5 + " moeda(s) de R$ 0.05");
        // System.out.println(cent1 + " moeda(s) de R$ 0.01");

        double[] banknotes = new double[]{100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] coins = new double[]{1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        
        System.out.println("NOTAS:");
        double banknote = 0;
        for(int i = 0; i < banknotes.length; i++){
            banknote = num/banknotes[i];
            num %= banknotes[i];
            System.out.println((int)banknote + " nota(s) de R$ " + banknotes[i]);
        }
        System.out.println(num);
        System.out.println("MOEDAS:");
         for(int i = 0; i < coins.length; i++){
            banknote = num/coins[i];
            num %= coins[i];
            System.out.println((int)banknote + " moeda(s) de R$ " + coins[i]);
        }
    }
}
