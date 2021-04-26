import java.util.*;

/**
 * 2021-04-26
 */
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layers = sc.nextInt();
        String s = "";
        sc.close();

        for(int i = 0; i < layers; i++){            
            if(i % 2 != 0)
                s += "I love ";
            else if(i % 2 == 0)
                s += "I hate ";

            if(i == layers-1)
                continue;
            s += "that ";
        }

        s += "it";

        System.out.println(s);
    }
}