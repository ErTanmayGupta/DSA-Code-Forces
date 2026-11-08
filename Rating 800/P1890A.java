import java.util.*;
public class P1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            
            if (map.size() > 2) {
                sb.append("NO\n");
            } 
            else if (map.size() == 1) {
                sb.append("YES\n");
            } 
            else {
                int firstCount = -1;
                boolean possible = true;
                for (int count : map.values()) {
                    if (firstCount == -1) {
                        firstCount = count;
                    } 
                    else {
                        if (Math.abs(firstCount - count) > 1) {
                            possible = false;
                        }
                    }
                }
                
                if (possible) {
                    sb.append("YES\n");
                } 
                else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb);
    }
}
