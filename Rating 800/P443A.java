import java.util.*;
public class P443A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int finalAns = 0;
        int[] freqAlp = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freqAlp[ch - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++){
            if(freqAlp[i] != 0){
                finalAns++;
            }
        }

        System.out.println(finalAns);
    }
}