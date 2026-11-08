import java.util.*;

public class P344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int group = 0;
        String prev = "";

        for(int i = 0; i < n; i++){
            String curr = sc.next().trim();
            if(i == 0 || !curr.equals(prev)){
                group++;
            }

            prev = curr;
        }

        System.out.println(group);
    }
}
