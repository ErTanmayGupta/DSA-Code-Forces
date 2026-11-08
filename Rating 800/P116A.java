import java.util.*;

public class P116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currCapacity = 0;
        int maxCapacity = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            currCapacity -= a;
            currCapacity += b;

            if(currCapacity > maxCapacity){
                maxCapacity = currCapacity;
            }
        }

        System.out.println(maxCapacity);
    }
}
