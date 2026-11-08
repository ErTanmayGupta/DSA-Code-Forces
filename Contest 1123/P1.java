import java.util.*;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            int coin = 0;
            int i = 0;
            int j = n - 1;

            while(i < j){
                char first = s.charAt(i);
                char secound = s.charAt(j);

                if(first != secound){
                    if(first == c || secound == c){
                        coin++;
                    }
                    else{
                        coin += 2;
                    }
                }

                i++;
                j--;
            }

            System.out.println(coin);
        }
    }
}
