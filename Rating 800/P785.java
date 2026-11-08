import java.util.*;

public class P785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long totalFaceCount = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("Tetrahedron")) {
                totalFaceCount += 4;
            } else if (s.equals("Cube")) {
                totalFaceCount += 6;
            } else if (s.equals("Octahedron")) {
                totalFaceCount += 8;
            } else if (s.equals("Dodecahedron")) {
                totalFaceCount += 12;
            } else if (s.equals("Icosahedron")) {
                totalFaceCount += 20;
            }
        }

        System.out.println(totalFaceCount);
    }
}
