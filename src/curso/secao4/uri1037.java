package curso.secao4;

import java.util.Scanner;

public class uri1037 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();

    if (a < 0.0 || a > 100.0) {

        System.out.println("Fora de intervalo");

    } else if (a <= 25.0) {

        System.out.println("Intervalo [0,25]");

    } else if (a <= 50.0) {

        System.out.println("Intervalo (25,50]");

    } else if (a <= 75.0) {

       System.out.println("Intervalo (50,75]");

    } else {

        System.out.println("Intervalo (75,100]");

    }

    sc.close();
 
    }
}