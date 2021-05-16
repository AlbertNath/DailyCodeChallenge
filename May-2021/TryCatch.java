import java.util.*;

/**
 * 2021-05-15
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int ans = x/y;
            System.out.println(ans);
        
        } catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
    
        } catch (Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}