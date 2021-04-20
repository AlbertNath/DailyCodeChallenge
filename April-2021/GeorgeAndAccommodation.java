import java.util.*;

/**
 * 2021-04-20
 */
public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int avilable = 0;

        for(int i = 0; i < rooms; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(p+2 <= q)
                avilable++;
        }
        sc.close();

        System.out.println(avilable);
    }
}