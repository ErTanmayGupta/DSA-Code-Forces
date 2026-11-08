import java.util.*;
public class P1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            int maxBlank = 0;
            int currBlank = 0;

            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                if(a == 0){
                    currBlank++;
                    maxBlank = Math.max(maxBlank , currBlank);
                }
                else{
                    currBlank = 0;
                }
            }

            sb.append(maxBlank).append("\n");
        }

        System.out.println(sb);
    }
}
