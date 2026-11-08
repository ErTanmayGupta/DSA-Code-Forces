import java.util.*;
public class P1857A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            int oddCount = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 != 0) {
                    oddCount++;
                }
            }

            if(oddCount % 2 == 0){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}