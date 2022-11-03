package curso.secao4;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int a = sc.nextInt();
    int b = sc.nextInt();
    double c;

    switch (a){
        
        case 1:
        c = b * 4.0;
        break;

        case 2:
        c = b * 4.5;
        break;

        case 3:
        c = b * 5.0;
        break;

        case 4:
        c = b * 2.0;
        break;

        case 5:
        c = b * 1.5;
        break;

        default:
        c = 0.0;
    }

    System.out.printf("Total: R$ %.2f%n", c);

    sc.close();
 
    }
}