import java.util.Scanner;

public class P281A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        // Convert the first character to uppercase and append the rest of the string
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        
        System.out.println(result);
    }
}