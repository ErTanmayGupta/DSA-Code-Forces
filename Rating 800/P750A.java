import java.util.*;
public class P750A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int totalMin = 240 - k;

        int solveCount = 0;
        int timeSpend = 0;

        for(int i = 1; i <= n; i++){
            int timeNeeded = 5 * i;
            if(timeSpend + timeNeeded <= totalMin){
                timeSpend += timeNeeded;
                solveCount++;
            }
            else{
                break;
            }
        }

        System.out.println(solveCount);
    }
}