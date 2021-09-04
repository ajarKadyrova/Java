import java.util.*;

class PopulationIncrease {
    public static void main (String[] args){
        int popA = 0, popB = 0, cnt = 0;
        double incA = 0, incB = 0;
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            popA = input.nextInt();
            popB = input.nextInt();
            incA = input.nextDouble();
            incB = input.nextDouble();
            cnt = 0;
            while(popA<=popB){
                popA += (popA*incA)/100;
                popB += (popB*incB)/100;
                cnt++;
                if(cnt>100){
                    break;
                }
            }
            if(cnt > 100) System.out.println("Mais de 1 seculo.");
            else System.out.println(cnt + " anos.");   
        }
        input.close();
    }
}