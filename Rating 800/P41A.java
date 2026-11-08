import java.util.*;

public class P41A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String t = sc.next().toLowerCase();
        
        String reversedS = new StringBuilder(s).reverse().toString();
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
