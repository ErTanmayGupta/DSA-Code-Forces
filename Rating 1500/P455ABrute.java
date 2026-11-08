import java.util.*;

public class P455ABrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        System.out.println(solve(1, max, freq));
    }

    public static long solve(int i, int max, int[] freq) {
        if (i > max) {
            return 0;
        }

        long skip = solve(i + 1, max, freq);
        long take = (long) i * freq[i] + solve(i + 2, max, freq);

        return Math.max(skip, take);
    }
}