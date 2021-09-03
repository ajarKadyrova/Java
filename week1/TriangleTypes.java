import java.util.Locale;
import java.util.Scanner;

public class TriangleTypes {
    
    public static void main(String args[]){
		
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double temp = 0;

        if(b > a && b > c){
            temp = a;
            a = b;
            b = temp;
        } else if (c > a && c > b){
            temp = a;
            a = c;
            c = temp;
        }

        if(a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        } if(a*a == (b*b + c*c)){
            System.out.println("TRIANGULO RETANGULO");
        } if(a*a > b*b + c*c){
            System.out.println("TRIANGULO OBTUSANGULO");
        } if(a*a < (b*b + c*c)){
            System.out.println("TRIANGULO ACUTANGULO");
        } if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
            return;
        } if(a == b || a == c || b == a || b == c){
            System.out.println("TRIANGULO ISOSCELES");
        }
	}

}