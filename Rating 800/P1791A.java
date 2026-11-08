import java.util.*;
public class P1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String target = "codeforces";

        while(t-- > 0){
            char ch = sc.next().charAt(0);

            if(target.indexOf(ch) != -1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
