import java.util.*;
public class P1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int left = 0; 
            int right = n - 1;

            while(left < right){
                if(s.charAt(left) != s.charAt(right)){
                    left++;
                    right--;
                }
                else{
                    break;
                }
            }

            int ansCurr = Math.max(0, right - left + 1);

            ans.append(ansCurr).append("\n");
        }

        System.out.print(ans);
    }
}
