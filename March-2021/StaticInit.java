import java.util.*;
import java.io.*;
/**
 * 2021-03-28
 */
public class StaticInit {
    
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;

    static {
        try {
            if(H <= 0 || B <= 0){
                flag = false;
                throw new Exception("Breadth and height" + 
                                    " must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
