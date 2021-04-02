import java.util.*;

/**
 * 2021-04-01
 */
public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int times = sc.nextInt();

        while (times-- != 0) {
            if(num % 10 == 0)
                num /= 10;
            else
                num--;
        }
        System.out.println(num);
        sc.close();
    }    
}
