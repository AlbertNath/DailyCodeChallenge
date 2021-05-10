import java.util.*;

/**
 * 2021-05-10
 */
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldiers = sc.nextInt();
        int maxVal = 0;
        int minVal = Integer.MAX_VALUE;
        int maxIndx = Integer.MIN_VALUE;
        int minIndx = 0;

        for(int i = 0; i < soldiers; i++){
            int tmp = sc.nextInt();

            if(tmp > maxVal){
                maxIndx = i;
                maxVal = tmp;
            }

            if(tmp <= minVal){
                minIndx = i;
                minVal = tmp;
            }
        }
        
        System.out.println((maxIndx > minIndx)? (maxIndx - 1)+(soldiers - minIndx)-1 :
                                                (maxIndx - 1)+(soldiers - minIndx));
        sc.close();
    }
}