import java.util.*; 

/**
 * 2021-04-21
 */
public class JList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        int elem = sc.nextInt();

        for(int i = 0; i < elem; i++)
            L.add(sc.nextInt());
        
        int queries = sc.nextInt();
        
        for(int j = 0; j < queries; j++){
            String querie = sc.next();
            if(querie.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);

            } else if(querie.equals("Delete")){
                int del = sc.nextInt();
                L.remove(del);
            }
        }
        sc.close();
        
        for(int v : L)
            System.out.print(v + " ");
    }
}