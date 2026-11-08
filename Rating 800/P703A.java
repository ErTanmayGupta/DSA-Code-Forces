import java.util.*;
public class P703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishkaWin = 0;
        int chrisWin = 0;

        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int c = sc.nextInt();

            if(m > c){
                mishkaWin++;
            }
            else if(c > m){
                chrisWin++;
            }
        }

        if(mishkaWin > chrisWin){
            System.out.println("Mishka");
        }
        else if(chrisWin > mishkaWin){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
