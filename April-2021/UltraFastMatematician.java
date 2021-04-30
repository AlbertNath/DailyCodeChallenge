import java.util.*;

/**
 * 2021-04-30
 */
public class UltraFastMatematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num1 = sc.next().toCharArray();
        char[] num2 = sc.next().toCharArray();
        char[] ans  = new char[num1.length];

        for(int i = 0; i < num1.length; i++)
            ans[i] = (num1[i] == num2[i])? '0' : '1';

        for(char c : ans)
            System.out.print(c);
        sc.close();
    }
}