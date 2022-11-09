package curso.secao4;

import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		
		double x;
		if (n <= 2000.0) {
			x = 0.0;
		}
		else if (n <= 3000.0) {
			x = (n - 2000.0) * 0.08;
		}
		else if (n <= 4500.0) {
			x = (n - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			x = (n - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (x == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", x);
		}
		
		sc.close();
	}
}
