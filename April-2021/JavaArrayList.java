import java.util.*;

/**
 * 2021-04-19
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        int lines = sc.nextInt();

        for(int i = 0; i < lines; i++){
            int[] l = new int[sc.nextInt()];

            for(int j = 0; j < l.length; j++){
                l[j] = sc.nextInt();
            }
            list.add(l);
        }
        
        int queries = sc.nextInt();
        for(int k = 0; k < queries; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {

                int[] elem = list.get(x-1);
                System.out.println(elem[y-1]);

            } catch (IndexOutOfBoundsException iobe) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}