import java.util.*;

public class PB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder finalAns = new StringBuilder();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int[] arr = new int[n];
            int val = 0;
            boolean[] store = new boolean[n + 1];

            for(int i = 1; i <= n; i++){
                char ch = s.charAt(i - 1);
                if(ch == '1'){
                    arr[val++] = i;
                }
                else if(ch == '2'){
                    if(val > 0){
                        store[arr[--val]] = true;
                    }
                    else{
                        store[i] = true;
                    }
                }
                else{
                    store[i] = true;
                }
            }

            int j = 0;
            StringBuilder ans = new StringBuilder();
            for(int i = 1; i <= n; i++){
                if(!store[i]){
                    j++;
                    ans.append(i).append(' ');
                }
            }

            finalAns.append(j).append('\n').append(ans).append('\n');
        }
        System.out.print(finalAns);
    }    
}
