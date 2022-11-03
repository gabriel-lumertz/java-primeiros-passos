package curso.secao4;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double a = sc.nextDouble();
    double b, c, d;

    if (a <= 400.0) {

        b = a * 1.15;
        c = b - a;
        d = 15;

    } else if (a <= 800.0) {

        b = a * 1.12;
        c = b - a;
        d = 12;

    } else if (a <= 1200.0) {

        b = a * 1.10;
        c = b - a;
        d = 10;

    } else if (a <= 2000.0) {

        b = a * 1.07;
        c = b - a;
        d = 7;

    } else {

        b = a * 1.04;
        c = b - a;
        d = 4;

    }

    System.out.printf("Novo salario: %.2f%n", b);
    System.out.printf("Reajuste ganho: %.2f%n", c);
    System.out.printf("Em percentual: %.0f %%%n", d);

    sc.close();
 
    }
}