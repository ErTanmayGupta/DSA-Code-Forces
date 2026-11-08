import java.util.*;
public class P1722A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char[] target = {'T' , 'i' , 'm' , 'r' , 'u'};
        Arrays.sort(target);

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if(n != 5){
                sb.append("NO\n");
                continue;
            }

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            if(Arrays.equals(ch, target)){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}