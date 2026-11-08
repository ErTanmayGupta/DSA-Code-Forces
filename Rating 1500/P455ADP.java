import java.util.*;

public class P455ADP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxVal = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        int[] count = new int[maxVal + 1];
        for (int i = 0; i < n; ++i) {
            count[arr[i]]++;
        }

        long prev = 0L;     
        long prevPrev = 0L; 

        for (int i = 1; i <= maxVal; ++i) {
            long takeCurrent = (long) i * count[i] + prevPrev; // take element i
            long maxPoints = Math.max(prev, takeCurrent);      // max(dp[i-1], dp[i-2] + i * count[i])
            
            prevPrev = prev;
            prev = maxPoints;
        }

        System.out.println(prev);
    }
}
