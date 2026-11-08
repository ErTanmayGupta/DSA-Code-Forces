import java.util.*;
public class P1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int operations = 0;
            boolean found = false;

            for(int i = 0; i <= 5; i++){
                if(x.contains(s)){
                    found = true;
                    break;
                }
                x = x + x;
                operations++;
            }

            if(found){
                System.out.println(operations);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
