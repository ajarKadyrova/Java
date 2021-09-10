import java.util.*;

public class PerfectNumber {
    public static void main (String[] args){
        int[] arr = new int[15000];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        } 
        input.close();
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 1; j <= arr[i]/2; j++){
                if(arr[i] % j == 0){
                    sum += j;
                }
            }
            if(sum == arr[i]){
            System.out.println(arr[i] + " eh perfeito");
        } else System.out.println(arr[i] + " nao eh perfeito");
        }
        System.out.println(sum);
    }
}
