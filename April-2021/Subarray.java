import java.util.*;

/**
 * 2021-04-18
 */
public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for(int i = 0; i < l; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(allSubArrays(arr));        
    }

    public static int allSubArrays(int[] array) {
        int totalSum = 0;
        int neg = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                totalSum += array[j];
                if(totalSum < 0)
                    neg++;
            }
            totalSum = 0;
        }
        return neg;
    }
}