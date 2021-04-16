import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * 2021-04-16
 */
public class Array2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        System.out.println(hourglass(arr));
    }

    public static int hourglass(int[][] arr){
        int maxSum = Integer.MIN_VALUE, aux = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                aux = findSum(arr, i, j);
                maxSum = Math.max(maxSum, aux);
                
            }
        }
        return maxSum;
    }

    public static int findSum(int[][] arr, int i, int j) {
        int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                  arr[i+1][j+1] + 
                  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        return sum;
    }
}