package curso.secao3;

import java.util.Scanner;

public class uri1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a, b;

        double a, b, c;
        
        a = sc.nextInt();

        b = sc.nextInt();

        c = (a * b) / 12;

        System.out.printf("%.3f%n", c);

        sc.close();
        
    }
    
}
