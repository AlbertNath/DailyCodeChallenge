import java.util.*;
import java.io.*;
/**
 * 2021-03-15
 */
public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for(int j = 0; j < i; j++){
            try {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                    System.out.println("* byte\n* short\n* int\n* long");
                else
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                    System.out.println("* short\n* int\n* long");
                else
                if(x >= Integer.MIN_VALUE && x <=Integer.MAX_VALUE)
                    System.out.println("* int\n* long");
                else
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}