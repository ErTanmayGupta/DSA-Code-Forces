import java.util.*;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int[] freq = new int[101];
            for(int i = 0; i < n; i++){
                freq[arr[i]]++;
            }

            int freqMax = 0;
            for(int i = 1; i <= 100; i++){
                if(freq[i] > freqMax){
                    freqMax = freq[i];
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 1; i <= freqMax; i++){
                for(int j = 100; j >= 1; j--){
                    if(freq[j] >= i){
                        sb.append(j).append(" ");
                    }
                }
            }

            System.out.println(sb.toString().trim());

        }
    }
}
