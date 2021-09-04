import java.util.Locale;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String args[]){
        double[][] arr = new double[12][12];
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int c = input.nextInt();
        char t = input.next().charAt(0);
        
        double sum = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                arr[i][j] = input.nextDouble();
                if(j == c){
                    sum += arr[i][j];
                }
            }
        }
        input.close();
        
        if(t == 'S'){
            System.out.println(String.format("%.1f", sum));
        } else if (t == 'M'){
            System.out.println(String.format("%.1f", (sum/12)));
        }
    }
}
