import java.util.*;

public class P910A{
    static int[] dp;
    static int INF = Integer.MAX_VALUE/2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        String s = sc.next();
        
        dp = new int[n];
        Arrays.fill(dp , -1);

        int ans = solver(s,0, n, d);

        if(ans >= INF){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }

    public static int solver(String s , int i , int n , int d){
        if(i == n-1){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int ans = INF;
        
        for(int step = 1; step <= d; step++){
            int nextPos = i + step;
            if(nextPos < n && s.charAt(nextPos) == '1'){
                int res = solver(s, nextPos, n, d);
                if(res != INF){
                    ans = Math.min(ans , 1 + res);
                }
            }
        }

        return dp[i] = ans;
    }
}