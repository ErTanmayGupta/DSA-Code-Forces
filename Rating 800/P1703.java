import java.util.*;
public class P1703{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next().toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}