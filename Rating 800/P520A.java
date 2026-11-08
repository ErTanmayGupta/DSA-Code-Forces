import java.util.*;

public class P520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if(n < 26){
            System.out.println("NO");
            return;
        }

        char[] freq = new char[26];
        for(int i = 0; i < n; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            freq[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
