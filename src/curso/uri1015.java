package curso;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double x1 = sc.nextDouble();

        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();

        double y2 = sc.nextDouble();

        double x = Math.pow(x2 - x1, 2);

        double y = Math.pow(y2 - y1, 2);

        double z = Math.sqrt((x + y));

        System.out.printf("%.4f%n", z);

        sc.close();
        
    }
    
}
