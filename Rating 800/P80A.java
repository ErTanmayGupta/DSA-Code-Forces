import java.util.*;
public class P80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrime = n + 1;

        while(!isPrime(nextPrime)){
            nextPrime++;
        }

        if(nextPrime == m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int num){
        if(num < 1){
            return false;
        }

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
