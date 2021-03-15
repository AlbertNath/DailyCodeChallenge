import java.util.*;

/**
 * 2021-03-13
 */
public class Watermelon {
    /**
     * This method indicates if the watermelon can 
     * be divided in two even parts.
     * @param w the weight of our watermelon.
     */ 
    private static void divided(int w) {
        if(w%2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        divided(weight);
    }
}