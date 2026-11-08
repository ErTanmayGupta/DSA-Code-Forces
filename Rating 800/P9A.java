import java.util.*;

public class P9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();

        int maxPoints = Math.max(y, w);
        
        int favorableOutcomes = 6 - maxPoints + 1;
        int totalOutcomes = 6;
        
        if (favorableOutcomes <= 0) {
            System.out.println("0/1");
            return;
        }
        
        int gcd = getGcd(favorableOutcomes, totalOutcomes);
        
        int numerator = favorableOutcomes / gcd;
        int denominator = totalOutcomes / gcd;
        
        System.out.println(numerator + "/" + denominator);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}
