import java.util.*;

public class P59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int upperCount = 0;
        int lowerCount = 0;

        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else{
                lowerCount++;
            }
        }

        if(upperCount > lowerCount){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}
