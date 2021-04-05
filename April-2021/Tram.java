import java.util.*;
/**
 * 2021-04-05
 */
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int minCapacity = 0, actualCapacity = 0, 
            in = 0, out = 0;
        
        for(int i = 0; i < stops; i++){
            out = sc.nextInt();
            in = sc.nextInt();

            actualCapacity -= out;
            actualCapacity += in;

            if (actualCapacity > minCapacity)
                minCapacity = actualCapacity;
        }
        
        sc.close();
        System.out.println(minCapacity);
    }
}