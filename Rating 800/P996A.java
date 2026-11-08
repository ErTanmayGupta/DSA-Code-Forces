import java.util.*;

public class P996A {
    // Greedy Approach 
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int count = 0;
    //     int[] denominations = {100, 20, 10, 5, 1};

    //     for(int coin : denominations){
    //         count += n / coin;
    //         n %= coin;
    //     }
    //     System.out.println(count);
    // }

    // Dynamic Programming Approach
    public static int solve(int amount, int [] c , int[] dp){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[amount] != -1){
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;
        for(int i =0; i<c.length; i++){
            int ans = solve(amount-c[i], c , dp);
            if(ans != Integer.MAX_VALUE){
                min = Math.min(ans+1, min);
            }
        }
        return dp[amount] = min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] denominations = {100, 20, 10, 5, 1};

        if(n >= 100){
            count += n/100;
            n %= 100;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(count + solve(n , denominations, dp));
        
    }
}
