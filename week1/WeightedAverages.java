import java.text.DecimalFormat;
import java.util.*;

public class WeightedAverages {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            double res = (x*2 + y*3 + z*5)/10;
            System.out.println(String.format("%.1f", res));
        }
        input.close();
    }
}
