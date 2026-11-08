import java.util.*;
public class P1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            String s = sc.next();
            StringBuilder ans = new StringBuilder();

            ans.append(s.charAt(0));

            for(int i = 1; i < s.length(); i += 2){
                ans.append(s.charAt(i));
            }

            System.out.println(ans.toString());
        }
    }
}
