import java.util.*;

public class P705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                result.append("I hate");
            }
            else{
                result.append("I love");
            }

            if(i == n){
                result.append(" it");
            }
            else{
                result.append(" that ");
            }
        }

        System.out.println(result.toString());
    }    
}
