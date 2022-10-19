package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // String a = sc.next();

        double b = sc.nextDouble();

        double c = sc.nextDouble();

        double d = b + c * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", d);

        sc.close();
        
    }
    
}
