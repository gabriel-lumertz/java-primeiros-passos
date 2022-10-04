package curso;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá mundo");
		System.out.println("Bom dia");

		int y = 21;
		System.out.println(y);

		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);

		System.out.println("Resultado = " + x + " metros");

		System.out.printf("Resultado = %.2f metros%n", x);

		String name = "Maria";
		int age = 33;
		double income = 4000.00;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", name, age, income);

	}

}
