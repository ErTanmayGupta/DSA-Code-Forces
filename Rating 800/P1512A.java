import java.util.*;
public class P1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int uniqueIdx = -1;
            int commonVal = 0;

            if(a[0] == a[1]){
                commonVal = a[0];
            }
            else if(a[0] == a[2]){
                commonVal = a[0];
            }
            else{
                uniqueIdx = 1;
            }

            if (uniqueIdx == -1) {
                for (int i = 0; i < n; i++) {
                    if (a[i] != commonVal) {
                        uniqueIdx = i + 1; 
                        break;
                    }
                }
            }
            
            System.out.println(uniqueIdx);
        }
    }
}
