package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a, b, c, d;

        double e, f, g;
        
        a = sc.nextInt();

        b = sc.nextInt();

        e = sc.nextDouble();

        c = sc.nextInt();

        d = sc.nextInt();

        f = sc.nextDouble();

        g = b * e + d * f;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", g);

        sc.close();
        
    }
    
}
