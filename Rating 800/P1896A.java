import java.util.*;
public class P1896A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            if(a[0] == 1){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}