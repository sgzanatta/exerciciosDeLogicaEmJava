package estruturaCondicional;

import java.util.Scanner;

public class A34_if_elseExercicio03_NumerosMultiplos {

	public static void main(String[] args) {
// Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//Multiplos, indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser 
//digitados em ordem crescente ou decrescente.
		
			Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o 1� numero : ");
		n1 = sc.nextInt();
		System.out.println("Digite o 2� numero : ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0)
			System.out.println("SAO MULTIPLOS");
		else
			System.out.println("NAO SAO MULTIPLOS");
		
		
		
		sc.close();
	}

}
