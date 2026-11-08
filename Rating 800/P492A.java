import java.util.*;
public class P492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int height = 0;
        int cubesNeeded = 0;
        int totalCubesUsed = 0;

        while(true){
            height++;
            cubesNeeded += height;
            totalCubesUsed += cubesNeeded;

            if(totalCubesUsed > n){
                height--;
                break;
            }
        }

        System.out.println(height);
    }
}
