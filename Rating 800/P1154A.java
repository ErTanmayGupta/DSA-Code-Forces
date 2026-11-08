import java.util.*;
public class P1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] x = new long[4];
        for(int i = 0; i < 4; i++){
            x[i] = sc.nextLong();
        }

        Arrays.sort(x);
        
        long abc = x[3];
        long a = abc - x[2];
        long b = abc - x[1];
        long c = abc - x[0];

        System.out.println(a + " " + b + " " + c);
    }
}
