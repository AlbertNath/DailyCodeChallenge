import java.util.*;

/**
 * 2021-05-20
 */
public class AntonAndPolyedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < num; i++){
            String polyedron = sc.next();

            switch (polyedron) {
                case "Tetrahedron":
                    ans += 4;
                    break;
                case "Cube":
                    ans += 6;
                    break;

                case "Octahedron":
                    ans += 8;
                    break;

                case "Dodecahedron":
                    ans += 12;
                    break;

                case "Icosahedron":
                    ans += 20;
                    break;
                
                default:
                    break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}