import java.util.*;
public class P1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] dis = new int[4];
            for(int i = 0; i < 4; i++){
                dis[i] = sc.nextInt();
            }

            int count = 0;
            int timur = dis[0];
            for(int i = 1; i < 4; i++){
                if(timur < dis[i]){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
