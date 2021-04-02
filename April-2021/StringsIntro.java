import java.util.*;

/**
 * 2021-04-02
 */
public class StringsIntro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        //Sum lengths
        System.out.println(A.length() + B.length());

        //Comparision 
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        //Capitalization of words.
        String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(aCap + " " + bCap);
        sc.close();
    }
}