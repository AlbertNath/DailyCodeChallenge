import java.util.*;

/**
 * 2021-04-15
 */
public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder(sc.next());
        StringBuilder word2 = new StringBuilder(sc.next());
        StringBuilder wordRev = word.reverse();
        sc.close();

        System.out.println((word2.toString().equals(wordRev.toString()))? "YES" : "NO");
    }    
}