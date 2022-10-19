package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        int d = (a + b + Math.abs(a - b)) / 2;

        int e = (c + d + Math.abs(c - d)) / 2;

        System.out.println(e + " eh o maior");

        sc.close();
        
    }
    
}
