import java.util.*;

/**
 * 2021-05-07
 */
public class JDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.push(num);
            set.add(num);

            if(deque.size() == m){
                ans = (set.size() > ans)? set.size() : ans;
                int pop = deque.pop();
                if(!deque.contains(pop))
                    set.remove(pop);
            }
        }

        in.close();
        System.out.println(ans);
    }
}