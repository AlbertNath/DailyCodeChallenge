import java.util.*;
/**
 * 2021-03-24
 */
class UsernameValidator {
    public static final String 
                        regularExpression = "^[a-zA-Z][\\w][0-9]{7,29}$"; 
}

public class Valid_Username_Regex {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
