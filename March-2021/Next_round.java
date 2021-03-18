import java.util.*;

/**
 * 2021-03-17
 */
public class Next_round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int next = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] cont = new int[n];
        sc.nextLine();

        for (int i = 0; i < n; i++){
            cont[i] = sc.nextInt(); 
        }
        
        for(int i = 0; i < n; i++){
            if (cont[i] <= 0)
                continue;
            if (cont[i] >= cont[k-1])
                next++;
        }
        System.out.println(next);
    }
}
