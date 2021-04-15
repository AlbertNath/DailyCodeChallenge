import java.util.*;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        int Anton = 0, Danik = 0;
        String line = sc.next();
        sc.close();

        for(int i = 0; i < rounds; i++){
            if(line.charAt(i) == 'A')
                Anton++;
            else
                Danik++;
        }

        if(Anton == Danik)
            System.out.println("Friendship");
        else
            System.out.println((Anton > Danik)? "Anton" : "Danik");
    }
}