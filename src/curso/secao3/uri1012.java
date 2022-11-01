package curso.secao3;

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c;

        double pi = 3.14159;
        
        a = sc.nextDouble();

        b = sc.nextDouble();

        c = sc.nextDouble();

        double triangulo = (a * c) / 2.0;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);

        double circulo = pi * Math.pow(c, 2);

        System.out.printf("CIRCULO: %.3f%n", circulo);

        double trapezio = ((a + b) * c) / 2.0;

        System.out.printf("TRAPEZIO: %.3f%n", trapezio);

        double quadrado = b * b;

        System.out.printf("QUADRADO: %.3f%n", quadrado);

        double retangulo = a * b;

        System.out.printf("RETANGULO: %.3f%n", retangulo);


        sc.close();
        
    }
    
}
