import java.util.*;
public class P141A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();

        if(guest.length() + host.length() != pile.length()){
            System.out.println("NO");
            return;
        }

        int[] freq = new int[26];
        for(int i = 0; i < guest.length(); i++){
            char ch = guest.charAt(i);
            freq[ch - 'A']++;
        }

        for(int i = 0; i < host.length(); i++){
            char ch = host.charAt(i);
            freq[ch - 'A']++;
        }
        
        for(int i = 0; i < pile.length(); i++){
            char ch = pile.charAt(i);
            freq[ch - 'A']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}