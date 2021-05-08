import java.util.*;


public class IsYourHoseshoeInTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        int counter = 0;

        for(int i = 0; i < 4; i++)
            nums[i] = sc.nextInt();
        

        Arrays.sort(nums);
        for(int j = 0; j < 3; j++)
            if(nums[j] == nums[j+1])
                counter++;

        System.out.println(counter);
        sc.close();
    }
}
