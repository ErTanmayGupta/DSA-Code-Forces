import java.util.*;
public class P1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();

            char temp = aArr[0];
            aArr[0] = bArr[0];
            bArr[0] = temp;

            System.out.println(new String(aArr) + " " + new String(bArr));
        }
    }
}
