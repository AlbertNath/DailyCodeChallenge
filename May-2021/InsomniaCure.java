import java.util.*;

/**
 * 2021-05-6
 */
public class InsomniaCure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= d; i++)
            if(i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0)
                count++;
        
        System.out.println(count);
        sc.close();
    }
}