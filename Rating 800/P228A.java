import java.util.*;

public class P228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> HS = new HashSet<>();

        for(int i = 0; i < 4; i++){
            HS.add(sc.nextInt());
        }

        int duplicateCount = 4 - HS.size();

        System.out.println(duplicateCount);
    }
}
