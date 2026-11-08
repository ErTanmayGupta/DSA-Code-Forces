import java.util.*;
public class P2276A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = -1;

            for(int k = b; k >= 1; k--){
                if(a >= b + k){
                    ans = k;
                    break;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
