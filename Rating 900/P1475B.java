import java.util.*;

public class P1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int y = sc.nextInt();
            int count = y / 2020;
            boolean found = false;
            
            while(count >= 0) {
                int remaining = y - count * 2020;
                if (remaining % 2021 == 0) {
                    found = true;
                    break;
                }
                count--;
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}
