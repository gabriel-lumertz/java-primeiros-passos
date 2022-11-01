package curso.secao3;

import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n, raio, area;
        
        n = 3.14159;

        raio = sc.nextDouble();

        area = n * (raio * raio);

        System.out.printf("A=%.4f%n", area);

        sc.close();
        
    }
    
}
