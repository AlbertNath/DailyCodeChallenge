import java.util.*;

/**
 * 2021-04-07
 */
public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int countUpper = 0, countLower = 0;;
        sc.close();

        for(int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            if(Character.isUpperCase(c))
                countUpper++;
            else
                countLower++;
        }

        if(countUpper <= countLower)
            word = word.toLowerCase();
        else
            word = word.toUpperCase();
        
        System.out.println(word);
    }
}