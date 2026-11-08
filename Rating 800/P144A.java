import java.util.*;
public class P144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldiers = new int[n];
        for(int i = 0; i < n; i++){
            soldiers[i] = sc.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            if (soldiers[i] > soldiers[maxIndex]) {
                maxIndex = i;
            }
            if (soldiers[i] <= soldiers[minIndex]) {
                minIndex = i;
            }
        }

        int totalSeconds = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            totalSeconds--;
        }

        System.out.println(totalSeconds);
    }
}
