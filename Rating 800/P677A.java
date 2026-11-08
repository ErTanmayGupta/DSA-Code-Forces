import java.util.*;

public class P677A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        
        int totalWidth = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            
            if(a > f){
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }

        System.out.println(totalWidth);

    }
}
