import java.util.*;

/**
 * 2021-04-22
 */
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int[] numbers = new int[friends];

        for(int k = 0; k < friends; k++)
            numbers[k] = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < friends; i++){
            for(int j = 0; j < friends; j++){
                if(numbers[j]-1 == i){
                    System.out.print(j+1 + " ");
                    break;
                }
            }
        }
    }
}
