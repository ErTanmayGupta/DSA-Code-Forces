import java.util.*;
public class P1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();

            int sumFirst = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
            
            int sumLast = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');
            
            if (sumFirst == sumLast) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
