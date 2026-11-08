import java.util.Scanner;

public class P455ABest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];
        int maxNumber = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            maxNumber = Math.max(maxNumber, numbers[i]);
        }

        int[] frequency = new int[maxNumber + 1];

        for (int i = 0; i < n; i++) {
            frequency[numbers[i]]++;
        }

        long previous = 0;
        long current = 0;

        for (int number = 1; number <= maxNumber; number++) {

            long take = (long) number * frequency[number] + previous;
            long skip = current;

            long best = Math.max(take, skip);

            previous = current;
            current = best;
        }

        System.out.println(current);
    }
}