package estruturaCondicional;

import java.util.Scanner;

public class A34_if_elseExercicio02_ParImpar {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
		
			Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero : ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0 )
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		
		sc.close();
		
		
		
	}

}
