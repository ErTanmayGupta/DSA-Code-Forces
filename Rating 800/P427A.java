import java.util.*;
public class P427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int policeOfficer = 0;
        int crimes = 0;

        for(int i = 0; i < n; i++){
            int event = sc.nextInt();

            if(event == -1){
                if(policeOfficer > 0){
                    policeOfficer--;
                }
                else{
                    crimes++;
                }
            }
            else{
                policeOfficer += event;
            }
        }

        System.out.println(crimes);
    }
}
