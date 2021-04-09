import java.util.*;

/**
 * 2021-04-09
 */
public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int levels = sc.nextInt();
        ArrayList<Integer> littleX = new ArrayList<>();
        ArrayList<Integer> littleY = new ArrayList<>();
        
        int p = sc.nextInt();
        for(int a = 0; a < p; a++){
            littleX.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
        for(int b = 0; b < q; b++){
            littleY.add(sc.nextInt());
        }

        sc.close();
        littleX.removeAll(littleY);
        littleX.addAll(littleY);
        Collections.sort(littleX);
        

        for(int i = 0; i < levels; i++){
            if(littleX.size() != levels
              || !littleX.get(i).equals(i+1)){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}