import java.util.*;

public class P469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int[] level = new int[L +1];
        
        int p = sc.nextInt();
        for(int i = 1; i <= p; i++){
            int X = sc.nextInt();
            level[X]++;
        }

        int q = sc.nextInt();
        for(int i = 1; i <= q; i++){
            int Y = sc.nextInt();
            level[Y]++;
        }

        for(int i = 1; i <= L; i++){
            if(level[i] == 0){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
    }    
}
