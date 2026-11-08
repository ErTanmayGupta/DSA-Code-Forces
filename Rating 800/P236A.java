import java.util.*;

public class P236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for(char u : userName.toCharArray()){
            uniqueCharacters.add(u);
        }

        if(uniqueCharacters.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } 
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
