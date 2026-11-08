import java.util.*;

public class P271A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true) {
            year++;
            if (hasDistinctDigits(year)) {
                System.out.println(year);
                break;
            }
        }
    }

    public static boolean hasDistinctDigits(int year) {
        int a = year / 1000;      
        int b = (year / 100) % 10;  
        int c = (year / 10) % 10;   
        int d = year % 10;         

        return (a != b && a != c && a != d && b != c && b != d && c != d);
    }
}
