import java.util.*;
public class P1560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sequence = new int[1001];
        int index = 1;
        int current = 1;
        
        while (index <= 1000) {
            if (current % 3 != 0 && current % 10 != 3) {
                sequence[index] = current;
                index++;
            }
            current++;
        }

        int t = sc.nextInt();

        while(t-- > 0){
            int k = sc.nextInt();
            System.out.println(sequence[k]);
        }
    }
}
