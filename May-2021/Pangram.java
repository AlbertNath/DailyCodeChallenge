import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        String str = sc.next();
        str = str.toLowerCase();
    
        if(num >= 26){
            for(char c = 'a'; c <= 'z'; c++)
                if(str.indexOf(c) != -1)
                    count++;
            
            System.out.println((count == 26)? "YES" : "NO");

        } else {
            System.out.println("NO");
        }
        sc.close();      
    }
}
