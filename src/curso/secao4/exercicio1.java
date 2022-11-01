package curso.secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();

    double nf = n1 + n2;

    System.out.printf("NOTA FINAL = %.1f%n", nf);

    if (nf < 60.0) {
        System.out.println("REPROVADO");
    }

    sc.close();

    }
    
}
