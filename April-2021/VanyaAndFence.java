import java.util.*;

/**
 * 2021-04-19
 */
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int hFence = sc.nextInt();
        int min = 0;
        
        for(int i = 0; i < friends; i++){
            int height = sc.nextInt();
            if(height > hFence)
                min += 2;
            else
                min++;
        }
        sc.close();
        System.out.println(min);
    }
}