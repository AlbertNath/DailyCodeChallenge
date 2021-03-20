import java.util.*;

import javax.sound.midi.SysexMessage;

import java.io.*;

/**
 * 2021-03-20
 */
public class DominoPiling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int board = M*N;

        System.out.println(board/2);
    }
}
