import java.util.*;

public class P339A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;

        for(int i = 0; i < s.length(); i+=2){
            char ch = s.charAt(i);
            if(ch == '1'){
                countOne++;
            }
            else if(ch == '2'){
                countTwo++;
            }
            else{
                countThree++;
            }
        }

        StringBuilder ans = new StringBuilder();
        while(countOne-- != 0){
            ans.append("1+");
        }
        while(countTwo-- != 0){
            ans.append("2+");
        }
        while(countThree-- != 0){
            ans.append("3+");
        }

        if(ans.length() > 0){
            ans.setLength(ans.length() - 1);
        }

        System.out.println(ans);

    }
}