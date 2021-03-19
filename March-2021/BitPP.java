import java.util.*;

/**
 * 2021-03-19
 */
public class BitPP {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int statements = sc.nextInt();
        int X = 0;
        String action;

        for(int i = 0; i < statements; i++){
            action = sc.next();
            if(action.contains("++"))
                X++;
            else if (action.contains("--"))
                X--;
        }
        System.out.println(X);
    }    
}
