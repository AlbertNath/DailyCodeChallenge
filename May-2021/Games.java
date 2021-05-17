import java.util.*;

/**
 * 2021-05-16
 */
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int count = 0;
        int a[] = new int[games];
        int b[] = new int[games];

        for(int i = 0; i < games; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int j = 0; j < games; j++){
            for(int k = 0; k < games; k++)
                if(a[j] == b[k])
                    count++;
        }

        System.out.println(count);
        sc.close();
    }
}
