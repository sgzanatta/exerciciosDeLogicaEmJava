package estrutarasRepetitivasEnquanto_While;

import java.util.Scanner;

public class A44_SomaDeNumerosInteiros {

	public static void main(String[] args) {
		// Fazer um programa que le n�meros inteiros at� que um zero seja lido.
		// Ao final mostrar a soma dos n�meros lidos.
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma = 0;
		
		
		while (numero != 0) {
			soma = soma + numero;
			numero = sc.nextInt();	
		}
		
		System.out.println("A soma de todos os numeros � : "+ soma);
		
		sc.close();

	}

}
