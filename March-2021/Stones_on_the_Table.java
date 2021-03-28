import java.util.*;

import javax.sound.midi.SysexMessage;
/**
 * 2021-03-27
 */
public class Stones_on_the_Table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int take = 0, num = sc.nextInt();
        String stones = sc.next();
        Character s;

        for(int i = 0; i < num-1; i++){
            s = stones.charAt(i);
            if(s.equals(stones.charAt(i+1)))
                take++;
        }
        System.out.println(take);
    }    
}