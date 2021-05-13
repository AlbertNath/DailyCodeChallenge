import java.io.*;
import java.math.*;

/**
 * 2021-05-13
 */
public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( 
                                        new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger big = new BigInteger(n);

        System.out.println((big.isProbablePrime(1))? "prime" : "not prime");
        bufferedReader.close();
    }
}
