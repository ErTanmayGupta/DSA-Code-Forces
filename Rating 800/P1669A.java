import java.util.*;
public class P1669A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            if(x >= 1900){
                System.out.println("Division 1");
            }
            else if(x >= 1600){
                System.out.println("Division 2");
            }
            else if(x >= 1400){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
    }
}
