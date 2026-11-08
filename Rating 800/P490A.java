import java.util.*;
public class P490A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> programmers = new ArrayList<>(); 
        ArrayList<Integer> mathematicians = new ArrayList<>(); 
        ArrayList<Integer> sportsmen = new ArrayList<>(); 
        
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                programmers.add(i);
            } else if (t == 2) {
                mathematicians.add(i);
            } else if (t == 3) {
                sportsmen.add(i);
            }
        }
        
        int w = Math.min(programmers.size(), Math.min(mathematicians.size(), sportsmen.size()));
        
        System.out.println(w);
        
        for (int i = 0; i < w; i++) {
            int p = programmers.get(i);
            int s = sportsmen.get(i);
            int m = mathematicians.get(i);
            
            int[] team = {p, s, m};
            Arrays.sort(team);
            
            System.out.println(team[0] + " " + team[1] + " " + team[2]);
        }
    }
}
