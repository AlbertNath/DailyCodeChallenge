import java.util.*;

/**
 * 2021-04-24
 */
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();

        for(int i = 0; i < persons; i++){
            int tmp = sc.nextInt();
            if(tmp != 0){
                System.out.println("HARD");
                return;
            }
        }
        sc.close();
        System.out.println("EASY");
    }
}