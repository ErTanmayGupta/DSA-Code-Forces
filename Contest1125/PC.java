import java.util.*;

public class PC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] cnt = new long[60001];

        StringBuilder finalAns = new StringBuilder();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int m = n - 4;
            int[] v = new int[m];
            long ans = 0;

            for(int i = 0; i < m; i++){
                v[i] = arr[i] + arr[i + 2] - arr[i + 4];
                ans += cnt[v[i] + 30000]++;
            }

            for(int i = 0; i < m; i++){
                if(i + 2 < m && v[i] == v[i + 2]){
                    ans--;
                }
                if(i + 4 < m && v[i] == v[i + 4]){
                    ans--;
                }

                cnt[v[i] + 30000] = 0;
            }

            finalAns.append(ans).append('\n');
        }

        System.out.print(finalAns);
    }
}
