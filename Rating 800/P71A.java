import java.util.*;

public class P71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            sc.nextLine(); 
            
            while (t-- > 0) {
                if (sc.hasNextLine()) {
                    String s = sc.nextLine();
                    int n = s.length();
                    
                    if (n > 10) {
                        System.out.println("" + s.charAt(0) + (n - 2) + s.charAt(n - 1));
                    } else {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}