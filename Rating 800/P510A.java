import java.util.*;

public class P510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean rightSide = true;

        for(int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            if(i % 2 != 0){
                for (int j = 0; j < m; j++) {
                    sb.append('#');
                }
            }
            else{
                if (i % 4 == 2) {
                    for (int j = 0; j < m - 1; j++) {
                        sb.append('.');
                    }
                    sb.append('#');
                } 
                else {
                    sb.append('#');
                    for (int j = 0; j < m - 1; j++) {
                        sb.append('.');
                    }
                }
            }

            System.out.println(sb.toString());
        }
    }
}
