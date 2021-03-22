import java.util.*;

public class End_of_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int i = 1;
        
        while(sc.hasNext()){
           list.add(sc.nextLine()); 
        }
        for(String s : list){
            System.out.println(i + " " + s);
            i++;
        }        
    }    
}
