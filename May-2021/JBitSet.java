import java.util.*;

/**
 * 2021-04-09
 */
public class JBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setLength = sc.nextInt();
        int operations = sc.nextInt();
        
        BitSet bit1 = new BitSet(setLength);
        BitSet bit2 = new BitSet(setLength);

        BitSet[] sets = new BitSet[3];
        sets[1] = bit1;
        sets[2] = bit2; 

        for(int i = 0; i < operations; i++){
            String action = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (action) {
                case "AND":
                    sets[a].and(sets[b]);
                    break;

                case "OR":
                    sets[a].or(sets[b]);
                    break;

                case "XOR":
                    sets[a].xor(sets[b]);
                    break;

                case "FLIP":
                    sets[a].flip(b);
                    break;
                
                case "SET":
                    sets[a].set(b);
                    break;
                default:
                    break;
            }

            System.out.printf("%d %d\n", bit1.cardinality(), 
                                         bit2.cardinality());
        }
        sc.close();
    }
}