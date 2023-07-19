package estruturaSequencial;

import java.util.Scanner;

public class A26_EntradaDeDados_scnextDouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Voce digitou: %.2f%n " + x);
		
		sc.close();
		
		// sc.nextDouble(); só é utilizado por numeros com casas decimais.
		

	}

}
