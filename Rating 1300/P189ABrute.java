import java.util.*;

public class P189ABrute {
    public static int[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        dp = new int[n+1];
        Arrays.fill(dp, -2);

        System.out.println(maxPieces(n, a, b, c));
    }

    public static int maxPieces(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }

        if(dp[n] != -2){
            return dp[n];
        }

        int resA = maxPieces(n-a, a, b, c);
        int resB = maxPieces(n-b, a, b, c);
        int resC = maxPieces(n-c, a, b, c);

        int maxRes = Math.max(resA, Math.max(resB, resC));

        if(maxRes == -1){
            dp[n] = -1;
        }
        else{
            dp[n] = 1 + maxRes;
        }

        return dp[n];
    }
}
