import java.util.*;

public class P546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long n = sc.nextInt();
        long w = sc.nextInt();

        long totalCost = k * (w * (w + 1)) / 2;

        long borrow = totalCost - n;

        if(borrow < 0){
            System.out.println(0);
        }
        else{
            System.out.println(borrow);
        }
    }
}
