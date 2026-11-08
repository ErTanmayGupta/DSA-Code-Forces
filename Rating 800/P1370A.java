import java.util.*;
public class P1370A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            sb.append(n/2).append("\n");
        }

        System.out.println(sb);
    }
}
