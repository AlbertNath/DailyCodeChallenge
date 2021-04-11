import java.util.*;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int children = sc.nextInt();
        int time = sc.nextInt();
        StringBuilder queue = new 
                              StringBuilder(sc.next());
        sc.close();

        for (int i = 0; i < time; i++) {
            for(int j = 1; j < children; j++){

                if(queue.charAt(j) == 'G' && 
                   queue.charAt(j-1) == 'B'){

                    queue.setCharAt(j, 'B');
                    queue.setCharAt(j-1, 'G');
                    j++; //this skips a cycle, otherwise it repeats the 
                         //process twice.
                }
            }
        }

        System.out.println(queue);
    }
}
