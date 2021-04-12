import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 2021-04-12
 */
public class TagContentExctractor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases > 0){
			String line = in.nextLine();
            
            boolean isValid = false;
			Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher mat = p.matcher(line);

            while(mat.find()){
                System.out.println(mat.group(2));
                isValid = true;
            }
            
            if(!isValid)
                System.out.println("None");
			testCases--;
		}
        in.close();
    }
}
