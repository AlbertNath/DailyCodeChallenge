import java.util.*;
/**
 * 2021-03-25
 */
public class Word_Capitalization {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        Character ch = word.charAt(0);
        boolean upper = Character.isUpperCase(ch);
        StringBuilder cap = new StringBuilder(word);
        
        if(!upper)
            cap.setCharAt(0, Character.toUpperCase(ch));

        System.out.println(cap);
    }
}
