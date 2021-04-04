import java.util.*;
/**
 * 2021-04-04
 */
public class SubStringComparision {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> permutations = new ArrayList<>();

        for(int i = 0; i < s.length()- k+1; i++){
            permutations.add(s.substring(i, i + k));
        }
        Collections.sort(permutations);
        
        smallest = permutations.get(0);
        largest = permutations.get(permutations.size()-1);
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }    
}