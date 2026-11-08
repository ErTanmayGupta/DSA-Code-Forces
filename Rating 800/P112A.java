import java.util.*;

public class P112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int result = s1.compareToIgnoreCase(s2);

        if(result < 0){
            System.out.println("-1");
        }
        else if(result > 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
