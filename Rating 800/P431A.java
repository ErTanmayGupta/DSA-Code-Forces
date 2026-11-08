import java.util.*;

public class P431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] calories = new long[4];
        for(int i = 0; i < 4; i++){
            calories[i] = sc.nextLong();
        }

        String s = sc.next();

        long totalCalories = 0;
        for(int i = 0; i < s.length(); i++){
            int strip = s.charAt(i) - '1';
            totalCalories += calories[strip];
        }

        System.out.println(totalCalories);
    }
}
