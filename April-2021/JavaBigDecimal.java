import java.util.*;
import java.math.BigDecimal;

/**
 * 2021-04-14
 */
public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1 == null || s2 == null)
                    return 0;
                
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);

                return -(a.compareTo(b));
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}    