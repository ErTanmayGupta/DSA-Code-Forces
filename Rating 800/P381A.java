import java.util.*;
public class P381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for(int i = 0; i < n; i++){
            cards[i] = sc.nextInt();
        }

        int serejaScore = 0;
        int dimaScore = 0;

        int left = 0;
        int right = n - 1;
        boolean serejaTurn = true;

        while(left <= right){
            int choseCard;
            if(cards[left] > cards[right]){
                choseCard = cards[left];
                left++;
            }
            else{
                choseCard = cards[right];
                right--;
            }

            if(serejaTurn){
                serejaScore += choseCard;
            }
            else{
                dimaScore += choseCard;
            }

            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}
