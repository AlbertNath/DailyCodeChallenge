import java.util.*;

public class NearlyLuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int lucky = 0;
        sc.close();

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '7' || 
               num.charAt(i) == '4')
                lucky++;
        }
        System.out.println((lucky == 7 || lucky == 4)? "YES" : "NO");
    }
}