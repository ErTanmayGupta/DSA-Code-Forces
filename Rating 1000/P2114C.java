import java.util.*;

public class P2114C {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while(t-- > 0){
    //         int n = sc.nextInt();
    //         int[] arr = new int[n];
    //         for(int i = 0; i < n; i++){
    //             arr[i] = sc.nextInt();
    //         }

    //         int count = 1;
    //         int last = arr[0];
    //         for(int i = 1; i < n; i++){
    //             if(arr[i] >= last + 2){
    //                 count++;
    //                 last = arr[i];
    //             }
    //         }
    //         System.out.println(count);
    //     }
    // }

    static int[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            dp = new int[n];
            Arrays.fill(dp, -1);

            System.out.println(solve(0, arr));
        }
    }

    public static int solve(int idx, int[] arr){
        if(idx >= arr.length) return 0;

        if(dp[idx] != -1) return dp[idx];

        int skip = solve(idx + 1, arr);

        int nextIndex = search(idx + 1, arr, arr[idx] + 2);
        int take = 1 + solve(nextIndex, arr);

        return dp[idx] = Math.max(skip, take);
    }

    public static int search(int idx, int[] arr, int target){
        int left = idx;
        int right = arr.length - 1;
        int ans = arr.length; 

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] >= target){
                ans = mid;
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
