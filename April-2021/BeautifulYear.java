import java.util.*;

/**
 * 2021-04-17
 */
public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        while(true){
            year++;
            if(distinctDigits(String.valueOf(year))){
                System.out.println(year);
                break;
            }
        }
    }

    public static boolean distinctDigits(String yr) {
        int w = Character.getNumericValue(yr.charAt(0));
        int x = Character.getNumericValue(yr.charAt(1));
        int y = Character.getNumericValue(yr.charAt(2));
        int z = Character.getNumericValue(yr.charAt(3));

        HashSet<Integer> st = new HashSet<>();

        st.add(w);
        st.add(x);
        st.add(y);
        st.add(z);

        return st.size() == 4;
    }
}
