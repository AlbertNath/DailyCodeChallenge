import java.util.*;
/**
 * 2021-03-29
 */
public class Soldier_And_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costB1 = sc.nextInt();
        int dollars = sc.nextInt();
        int bananas = sc.nextInt();
        int total = 0;

        for(int i = 1; i <= bananas; i++){
            total += i * costB1;
        }

        int borrow = total - dollars;

        //System.out.println(Math.abs(borrow));
        if(total <= dollars)
            System.out.println("0");
        else
            System.out.println(borrow);

    }
}
