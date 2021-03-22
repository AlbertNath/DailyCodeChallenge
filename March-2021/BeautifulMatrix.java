import java.io.*;
import java.util.*;
/**
 * 2021-03-21
 */
public class BeautifulMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0, columns = 0;
        //rows
        for(int i = 1; i <= 5; i++){
            //columns
            for(int j = 1; j <= 5; j++){
                if(sc.nextInt() == 1){
                    rows = i;
                    columns = j;
                }
            }
        }
        System.out.println(Math.abs(rows-3) + 
                           Math.abs(columns-3));
    }    
}
