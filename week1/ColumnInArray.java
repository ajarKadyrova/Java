import java.util.Locale;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //int row = input.nextInt();
        char operation = input.next().charAt(0); ;
        double arr[]=new double[12];
        for (int i=0; i < 12; i++){
            double num = Double.parseDouble(args[i]);
            arr[i]=num;
        }
        input.close();
        double sum = 0;
        if(operation == 'S'){
            for (int i=0; i < 12; i++){
                sum += arr[i];
            }
        } else if(operation == 'M'){
            for (int i=0; i < 12; i++){
                sum += arr[i];
            }
            sum /= 12;
        }
        System.out.println(sum);
    }
}
