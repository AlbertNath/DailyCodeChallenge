import java.util.*;

/**
 * 2021-04-28
 */
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;

        ans += (n % 2 == 0)? n/2 : (-1)*(n/2 + 1);

        System.out.println(ans);
        sc.close();
    }
}