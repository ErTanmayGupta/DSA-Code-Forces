import java.util.*;
public class P1760A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int[] nums = new int[3];
            for(int i = 0; i < 3; i++){
                nums[i] = sc.nextInt();
            }
            
            Arrays.sort(nums);

            System.out.println(nums[1]);
        }
    }
}
