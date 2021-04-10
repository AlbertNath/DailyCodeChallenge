import java.util.Scanner;
import java.util.regex.*;

/**
 * 2021-04-10
 */
public class PatternSyntaxChecker {

    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
        while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException pse){
                System.out.println("Invalid");
            }        
            testCases--;
		}
        in.close();
	}    
}
