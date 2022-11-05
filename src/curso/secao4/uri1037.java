package curso.secao4;

import java.util.Locale;
import java.util.Scanner;

public class uri1037 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double a = sc.nextDouble();

    String b;

    if (a >= 0.0 || a <= 25.0) {

        b = "[0,25]";

    }

    System.out.printf("Intervalo %s%n", b);

    sc.close();
 
    }
}