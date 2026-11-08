import java.util.*;
public class P1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long diff = Math.abs(a - b);
            long move = (diff + 9) / 10;

            sb.append(move).append("\n");
        }

        System.out.println(sb);
    }
}
