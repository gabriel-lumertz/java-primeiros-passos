package curso.secao3;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double r = sc.nextDouble();

        double p = 3.14159;

        double v = (4.0 / 3.0) * p * Math.pow(r, 3); 

        System.out.printf("VOLUME = %.3f%n", v);

        sc.close();
        
    }
    
}
