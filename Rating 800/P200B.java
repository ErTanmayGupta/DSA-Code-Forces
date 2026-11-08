import java.util.*;

public class P200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sumAns = 0;

        for(int i = 0; i < n; i++){
            sumAns += sc.nextDouble();
        }

        System.out.println(sumAns / n);
    }    
}
