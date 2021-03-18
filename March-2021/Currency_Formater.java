import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 2021-03-18
 */
public class Currency_Formater {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble(); 
        sc.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(currency));
        System.out.println("India: " + in.format(currency));
        System.out.println("China: " + ch.format(currency));
        System.out.println("France: " + fr.format(currency));
    }
}
