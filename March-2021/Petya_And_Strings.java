import java.util.*;
import java.io.*;
/**
 * 2021-03-20
 */
public class Petya_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        line1 = line1.toLowerCase();
        line2 = line2.toLowerCase();
        
        if(line1.compareTo(line2) == 0)
            System.out.println("0");
        if(line1.compareTo(line2) > 0)
            System.out.println("1");
        if(line1.compareTo(line2) < 0)
            System.out.println("-1");
    }
}
