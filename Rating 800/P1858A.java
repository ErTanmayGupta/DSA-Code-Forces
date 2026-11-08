import java.util.*;
public class P1858A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (c % 2 != 0) {
                if (a + (c + 1) / 2 > b + c / 2) {
                    out.append("First\n");
                } 
                else {
                    out.append("Second\n");
                }
            } 
            else {
                if (a + c / 2 > b + c / 2) {
                    out.append("First\n");
                } 
                else {
                    out.append("Second\n");
                }
            }
        }

        System.out.println(out);
    }
}
