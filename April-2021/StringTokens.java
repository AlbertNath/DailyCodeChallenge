import java.util.*;

/**
 * 2021-04-08
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        
        if(s.length() > 0){
            String[] tokens = s.split("[\t !,?._'@]+");
            System.out.println(tokens.length);
            for (String t : tokens)
                System.out.println(t);
        }
        else
            System.out.println(0);
        sc.close();
    }    
}
