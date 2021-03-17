import java.io.*;
import java.util.*;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //Using Calendar (little bit messy)
        Calendar c = Calendar.getInstance();
        
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.YEAR, year);
        return c.getDisplayName(Calendar.DAY_OF_WEEK, 
                                Calendar.LONG, Locale.US).toUpperCase();
        //Using LocalTime (it's easier, it seems)
        /*LocalDate loc = LocalDate.of(year, month, day);
        String ans = loc.getDayOfWeek().toString();
        return ans;*/
    }

}

public class Date_of_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedReader.close();

        System.out.println(res);
    }
}

