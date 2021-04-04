import java.util.*;

public class StringReverse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        StringBuilder pal = new StringBuilder(A);
        
        if(A.equals(pal.reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");        
    }    
}
