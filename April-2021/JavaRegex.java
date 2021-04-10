import java.util.*;

/**
 * 2021-04-10
 */
public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {
    String regex = "(\\d{1,2}|(0|1)\\"
                    + "d{2}|2[0-4]\\d|25[0-5])";
    /*
    >> \d represents digits [0-9].
    >> \\d{1, 2} catches any one or two-digit number
    >> (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
    >> 2[0-4]\\d catches numbers between 200 and 249.
    >> 25[0-5] catches numbers between 250 and 255.
    */
    String pattern = regex + "\\." + regex + "\\." +
                     regex + "\\." + regex;
}
