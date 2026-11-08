import java.util.*;
public class P155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        
        int firstScore = sc.nextInt();
        int min = firstScore;
        int max = firstScore;
        int amazingCount = 0;
        
        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();
            if (score > max) {
                max = score;
                amazingCount++;
            } else if (score < min) {
                min = score;
                amazingCount++;
            }
        }
        
        System.out.println(amazingCount);
    }
}
