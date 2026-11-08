import java.util.*;

public class P61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        System.out.println(solver(num1, num2));
    }

    public static String solver(String num1 , String num2){
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) != num2.charAt(i)){
                ans.append('1');
            }
            else{
                ans.append('0');
            }
        }

        return ans.toString();
    }
}
