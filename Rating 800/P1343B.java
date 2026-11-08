import java.util.*;
public class P1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int half = n / 2;
            
            if (half % 2 != 0) {
                sb.append("NO\n");
                continue;
            }
            
            sb.append("YES\n");
            long sumEven = 0;
            int[] arr = new int[n];
            
            for (int i = 0; i < half; i++) {
                arr[i] = 2 * (i + 1);
                sumEven += arr[i];
            }
            
            long sumOdd = 0;
            for (int i = 0; i < half - 1; i++) {
                arr[half + i] = 2 * i + 1;
                sumOdd += arr[half + i];
            }
            
            arr[n - 1] = (int) (sumEven - sumOdd);
            
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(i == n - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
