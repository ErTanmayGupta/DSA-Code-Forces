import java.util.*;
public class P1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            int wrongEven = 0;
            int wrongOdd = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(i % 2 == 0 && a[i] % 2 != 0){
                    wrongEven++;
                }
                else if(i % 2 != 0 && a[i] % 2 == 0){
                    wrongOdd++;
                }
            }

            if(wrongEven != wrongOdd){
                sb.append(-1).append("\n");
            }
            else{
                sb.append(wrongEven).append("\n");
            }
        }

        System.out.println(sb);
    }
}
