import java.util.*;

/**
 * 2021-04-06
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean status = true;
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");

        if(a.length() != b.length())
            return status = false;
        
        char s1[] = a.toLowerCase().toCharArray();
        char s2[] = b.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < a.length(); i++)
            if (s1[i] != s2[i])
                status = false;
        return status;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}