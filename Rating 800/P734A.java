import java.util.*;

public class P734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int Anton = 0;
        int Danik = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                Anton++;
            } else {
                Danik++;
            }
        }
        if (Anton > Danik) {
            System.out.println("Anton");
        } else if (Danik > Anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
