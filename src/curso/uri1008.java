package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a, b;

        double c, d;
        
        a = sc.nextInt();

        b = sc.nextInt();

        c = sc.nextDouble();

        d = b * c;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f%n", d);

        sc.close();
        
    }
    
}
