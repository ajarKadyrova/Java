import java.util.*;

public class Banknotes {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int num = input.nextInt();
		input.close();
		System.out.println(num);

		int hundred=0, fifty = 0, twenty = 0, ten =0, five = 0, two = 0, one = 0;
		hundred = num/100;
		num %= 100;
        fifty = num/50;
		num %= 50;
        twenty = num/20;
		num %= 20;
        ten = num/10;
		num %= 10;
        five = num/5;
		num %= 5;
        two = num/2;
		num %= 2;
        one = num/1;

		System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}
