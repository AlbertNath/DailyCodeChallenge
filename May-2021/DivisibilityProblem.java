import java.util.*;

/**
 * 2021-05-14
 */
public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println((a%b == 0)? "0" : b-a%b);
        }
        sc.close();
    }
}