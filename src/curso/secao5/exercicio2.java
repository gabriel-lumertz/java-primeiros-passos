package curso.secao5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Integer age = sc.nextInt();
    Integer sum = 0;
    Integer count = 0;

    while (age >= 0) {
        sum += age;
        count += 1;
        age = sc.nextInt();
    }

    if (count > 0) {
        Double average = (double) sum / count;
        System.out.printf("%.2f%n", average);
    } else {
        System.out.println("Impossivel calcular");
    }

    sc.close();

    }
    
}
