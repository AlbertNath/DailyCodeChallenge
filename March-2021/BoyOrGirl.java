import java.util.*;
/**
 * 2021-03-27
 */
public class BoyOrGirl {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        String name = sc.nextLine();
        char n[] = name.toCharArray();
        Arrays.sort(n);

        for(int i = 0; i < n.length-1; i++){
            if(!(n[i] == n[i+1]))
                num++;
        }

        if(num%2==1)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }    
}
