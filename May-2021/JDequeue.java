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

            deque.add(num);
            set.add(num);

            if(deque.size() == m){
                ans = (set.size() > ans)? set.size() : ans;
                int elem = deque.remove();
                if(!deque.contains(elem))
                    set.remove(elem);
            }
        }

        in.close();
        System.out.println(ans);
    }
}