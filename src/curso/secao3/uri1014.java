package curso.secao3;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a;

        double b, c;
        
        a = sc.nextInt();

        b = sc.nextDouble();

        c = a / b;

        System.out.printf("%.3f km/l%n", c);

        sc.close();
        
    }
    
}
