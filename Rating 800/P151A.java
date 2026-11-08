import java.util.*;
public class P151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = (k * l) / nl;

        int totalLime = c * d;

        int totalSalt = p / np;

        int maxToast = Math.min(totalDrink , Math.min(totalLime , totalSalt));

        int ans = maxToast / n;

        System.out.println(ans);
    }
}
