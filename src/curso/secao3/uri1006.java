package curso.secao3;

import java.util.Scanner;

public class uri1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a, b;

        double a, b, c, d;
        
        a = sc.nextDouble();

        b = sc.nextDouble();

        c = sc.nextDouble();

        d = ((a * 2) + (b * 3) + (c * 5)) / 10 ;

        System.out.printf("MEDIA = %.1f%n", d);

        sc.close();
        
    }
    
}
