import java.util.*;

/**
 * 2021-05-4
 */
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int drinks = sc.nextInt();
        double per = 0.0;

        for(int i = 0; i < drinks; i++)
            per += sc.nextInt();

        System.out.println(per/drinks);
        sc.close();
    }
}
