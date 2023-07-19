package estrutaraRepetitivaDo_FacaEnquanto;

import java.util.Locale;
import java.util.Scanner;

public class A54_ConvertorDeCelsiusParaFahrenheit {

	public static void main(String[] args) {
		// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		// em Fahrenheit. Perguntar se o usuario
		// deseja repetir (s/n). Caso o usuario digite "s", repetir o programa.

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char resp;

		do {
			System.out.println("Digite a Temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n) ? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}

}
