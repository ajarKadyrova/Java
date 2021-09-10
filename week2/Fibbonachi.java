import java.util.*;

public class Fibbonachi {
    public static void main(String[] args){
        long [] arr = new long [15000]; 
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= 60; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            //int res = fibbonachi(arr[i]);
            System.out.println("Fib(" + num+ ") = " + arr[num]);
        }
            
        input.close(); 
    }
}

//     public static int fibbonachi(int n){
//         if (n == 0){
//             return 0;
//         }
//         if (n == 1){
//             return 1;
//         }
//         else{
//             return fibbonachi(n - 1) + fibbonachi(n - 2);
//         }
//     }
// }
