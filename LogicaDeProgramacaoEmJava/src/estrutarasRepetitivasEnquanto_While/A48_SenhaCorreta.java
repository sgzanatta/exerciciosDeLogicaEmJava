package estrutarasRepetitivasEnquanto_While;

import java.util.Scanner;

public class A48_SenhaCorreta {
			
	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha até que ela seja válida.
		
		Scanner sc = new Scanner(System.in);
		int s1 = 2002;
		int s2;
		
		System.out.println("Digite a senha : ");
		s2 = sc.nextInt();
		
		while (s1 != s2) {
			System.out.println("SENNHA INVALIDA! Digite novamente :");
			s2 = sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO!");
		
				
		sc.close();
	}

}
