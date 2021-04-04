import java.util.*;

/**
 * 2021-04-03
 */
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        int ans = (pos%5 == 0)? pos/5 : pos/5+1;

        System.out.println(ans);
    }    
}
