import java.util.*;
public class P1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int maxDis = a[0];

            for(int i = 1; i < n; i++){
                maxDis = Math.max(maxDis , a[i] - a[i - 1]);
            }

            int lastSeg = 2 * (x - a[n - 1]);
            maxDis = Math.max(maxDis , lastSeg);

            System.out.println(maxDis);
        }
    }
}
