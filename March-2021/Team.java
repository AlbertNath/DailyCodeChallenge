import java.util.*;
public class Team {
    /**
     * 2021-03-16
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sol = 0; 
        int problemsSolved = 0;
        int problems = sc.nextInt();

        //for number of problems (rows)
        for(int i = 0; i < problems; i++){
            //for solutions (columns)
            for(int j = 0; j<3; j++){
                int s = sc.nextInt();
                if(s == 1)
                    sol++;
            }
            if(sol >= 2){
                problemsSolved++;
                sol = 0;
            }
        }
        System.out.println(problemsSolved);
    }    
}
