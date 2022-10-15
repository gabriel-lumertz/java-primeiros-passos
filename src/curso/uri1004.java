package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a, b, prod;
        
        a = sc.nextInt();

        b = sc.nextInt();

        prod = a * b;

        System.out.println("SOMA = " + prod);

        sc.close();
        
    }
    
}
