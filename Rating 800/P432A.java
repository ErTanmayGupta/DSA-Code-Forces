import java.util.*;
public class P432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int teams = 0;

        for(int i = 0; i < n; i++){
            int y = sc.nextInt();

            if(5 - y >= k){
                teams++;
            }
        }

        System.out.println(teams / 3);
    }
}
