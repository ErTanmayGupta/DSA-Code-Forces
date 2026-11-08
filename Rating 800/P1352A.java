import java.util.*;
public class P1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> roundNum = new ArrayList<>();
            int placeVal = 1;

            while(n > 0){
                int digit = n % 10;
                if(digit > 0){
                    roundNum.add(digit * placeVal);
                }

                n /= 10;
                placeVal *= 10;
            }

            System.out.println(roundNum.size());
            for(int i = 0; i < roundNum.size(); i++){
                System.out.print(roundNum.get(i) + (i == roundNum.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
