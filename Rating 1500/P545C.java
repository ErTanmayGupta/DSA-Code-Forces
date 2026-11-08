import java.util.*;

public class P545C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] woodLoc = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                woodLoc[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n+1][2];
        for(int[] d : dp){
            Arrays.fill(d, -1);
        }

        System.out.println(solver(0 , 0 , woodLoc , dp));
    }

    public static int solver(int idx , int prevState , int[][] woodLoc , int[][] dp){
        if(idx >= woodLoc.length){
            return 0;
        }

        int x = woodLoc[idx][0];
        int h = woodLoc[idx][1];
        int prevEnd;
        if(idx == 0){
            prevEnd = Integer.MAX_VALUE;
        }
        else{
            int prevX = woodLoc[idx-1][0];
            int prevH = woodLoc[idx-1][1];

            if(prevState == 1){
                prevEnd = prevX + prevH;
            }
            else{
                prevEnd = prevX;
            }
        }

        if(dp[idx][prevState] != -1){
            return dp[idx][prevState];
        }

        int NoCut = solver(idx + 1 , 0 , woodLoc , dp);

        int leftCut = -1;
        if(idx == 0 || x-h > prevEnd){
            leftCut = solver(idx + 1 , 0 , woodLoc , dp) + 1;
        }
        
        int rightCut = -1;
        if(idx == woodLoc.length-1 || x + h < woodLoc[idx+1][0]){
            rightCut = solver(idx + 1 , 1 , woodLoc , dp) + 1;
        }
        
        return dp[idx][prevState] = Math.max(NoCut , Math.max(leftCut , rightCut));
    }
}
