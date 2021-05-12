import java.util.*;

/**
 * 2021-05-12
 */
public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();
        letters = letters.replaceAll("[^\\w]", "");
        
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < letters.length(); i++)
            set.add(letters.charAt(i));

        System.out.println(set.size());
        sc.close();
    }
}