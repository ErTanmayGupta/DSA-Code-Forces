import java.util.*;
public class P1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<Character> solvedProblem = new HashSet<>();
            int totalBallons = 0;

            for(int i = 0; i < n; i++){
                char problem = s.charAt(i);

                if(!solvedProblem.contains(problem)){
                    totalBallons += 2;
                    solvedProblem.add(problem);
                }
                else{
                    totalBallons++;
                }
            }

            System.out.println(totalBallons);

        }
    }
}
