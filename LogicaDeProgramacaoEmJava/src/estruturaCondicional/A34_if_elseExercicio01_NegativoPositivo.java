package estruturaCondicional;

import java.util.Scanner;

public class A34_if_elseExercicio01_NegativoPositivo {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("POSITIVO0");
		
		sc.close();
		
		
		

	}

}
