import java.util.*;
/**
 * 2021-13-03
 */
public class WayTooLongWords {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      sc.nextLine();
      String line;

      for(int i = 0; i < num; i++){
        line = sc.nextLine();
        
        if(line.length() <= 10)
            System.out.println(line);
        
        if(line.length() > 10){
            System.out.printf("%s%d%s\n", line.charAt(0), 
                                          line.length()-2, 
                                          line.charAt(line.length()-2));
        }
      }
    }
}