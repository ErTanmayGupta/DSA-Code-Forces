import java.util.*;

public class P231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int ans = 0;
        
        while(P-- > 0){
            int currCount = 0;
            for(int i = 0; i < 3; i++){
                currCount += sc.nextInt();
            }
            if(currCount >= 2){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
