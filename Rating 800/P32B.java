import java.util.*;
public class P32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '.'){
                sb.append('0');
            }
            else{
                if(i + 1 < n && s.charAt(i + 1) == '.'){
                    sb.append('1');
                }
                else{
                    sb.append('2');
                }

                i++;
            }
        }

        System.out.println(sb);
    }
}
