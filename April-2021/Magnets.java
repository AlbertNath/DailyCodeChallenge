import java.util.*;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magnets = sc.nextInt(); 
        int groups = 1;
        String mg1 = sc.next();

        for(int i = 1; i < magnets; i++){
            String tmp = sc.next();
            if(!(mg1.charAt(0) != tmp.charAt(tmp.length()-1)))
                groups++;
                
            mg1 = tmp;
        }
        sc.close();
        System.out.println(groups);
    }
}