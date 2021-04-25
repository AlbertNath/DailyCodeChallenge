import java.util.*;

/**
 * 2021-04-25
 */
public class JStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < input.length(); i++){
                Character ch = input.charAt(i);
                
                if(!stack.isEmpty()){
                    switch (ch) {
                        case ')':
                            if(stack.peek() == '(')
                                stack.pop();
                            break;

                        case '}':
                            if(stack.peek() == '{')
                                stack.pop();
                            break;

                        case ']':
                            if(stack.peek() == '[')
                                stack.pop();
                            break;

                        default:
                            stack.push(ch);
                    }
                } else
                        stack.push(ch);
            }
            
            System.out.println(stack.isEmpty());
		}

        sc.close();
    }
}
