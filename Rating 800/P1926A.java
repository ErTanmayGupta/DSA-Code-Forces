import java.util.*;
public class P1926A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();
            int[] freq = new int[2];

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    freq[0]++;
                } else {
                    freq[1]++;
                }
            }
            
            if (freq[0] > freq[1]) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
