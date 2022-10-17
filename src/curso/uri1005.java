package curso;

import java.util.Scanner;

public class uri1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a, b;

        double a, b, c;
        
        a = sc.nextDouble();

        b = sc.nextDouble();

        c = ((a * 3.5) + (b * 7.5)) / 11 ;

        System.out.printf("MEDIA = %.5f%n", c);

        sc.close();
        
    }
    
}
