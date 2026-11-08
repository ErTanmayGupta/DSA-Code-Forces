import java.util.*;

public class P136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gift = new int[n + 1];

        for(int i = 1; i <= n; i++){
            int p = sc.nextInt();
            gift[p] = i;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(gift[i]).append(i == n ? "" : " "); 
        }

        System.out.println(sb.toString());
    }
}
