import java.util.*;

public class PD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder finalAns = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] s = new long[n];
            long[] ext = new long[n];
            long minS = Long.MAX_VALUE;

            for(int i = 0; i < n; i++){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                s[i] = a + b + c;

                minS = Math.min(minS , s[i]);

                if(a > b || a > c || b > c){
                    ext[i] = 0;
                }
                else if(a == c){
                    ext[i] = -1;
                }
                else{
                    ext[i] = 2 * (Math.min(b-a , c - b) + 1);
                }
            }

            long l = minS;
            long h = minS + k;

            while(l < h){
                long mid = l + (h - l + 1) / 2;
                if(checker(mid , k , s , ext)){
                    l = mid;
                }
                else{
                    h = mid - 1;
                }
            }

            finalAns.append(l).append("\n");
        }

        System.out.println(finalAns);
    } 
    
    public static boolean checker(long T , long k , long[] s , long[] ext){
        long total = 0;
        for(int i = 0; i < s.length; i++){
            if(T <= s[i]){
                continue;
            }
            if(ext[i] < 0){
                return false;
            }
            total += T - s[i] + ext[i];
            if(total > k){
                return false;
            }
        }

        return true;
    }
}
