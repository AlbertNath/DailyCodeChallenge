import java.util.*;

public class Helpful_Maths {
    
    public static void Nums(String line) {
        ArrayList<Character> nums = new ArrayList<>();
        for(int i = 0; i < line.length(); i++){
            char a = line.charAt(i);
            if(Character.isDigit(a))
                nums.add(a);
        }

        Collections.sort(nums);
        
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i));
            if(i == nums.size()-1)
                continue;
            System.out.print("+");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Nums(line);
    }    
}