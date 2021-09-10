import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = new int[15000];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if(j == 1) continue;
                if (arr[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(arr[i] + " eh primo");
            } else
                System.out.println(arr[i] + " nao eh primo");
        }
    }
}