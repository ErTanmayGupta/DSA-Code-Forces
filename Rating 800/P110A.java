import java.util.*;

public class P110A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        int luckyNum = 0;
        for(int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if(ch == '4' || ch == '7'){
                luckyNum++;
            }
        }

        if(luckyNum == 4 || luckyNum == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
