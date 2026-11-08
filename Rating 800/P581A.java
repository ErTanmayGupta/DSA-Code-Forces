import java.util.*;
public class P581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diffDay = Math.min(a,b);

        int sameDay = (Math.max(a,b) - diffDay) / 2;

        System.out.println(diffDay + " " + sameDay);
    }
}
