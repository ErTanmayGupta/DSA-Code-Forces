import java.util.*;

public class P758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int maxWelfare = 0;

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > maxWelfare){
                maxWelfare = a[i];
            }
        }

        long totalSpend = 0;
        for(int i = 0; i < n; i++){
            totalSpend += (maxWelfare - a[i]);
        }

        System.out.println(totalSpend);
    }
}
