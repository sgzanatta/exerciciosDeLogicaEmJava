package estruturaSequencial;

import java.util.Scanner;

public class A28_Exercicio03 {

	public static void main(String[] args) {

		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto 
		//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D)

			Scanner sc = new Scanner(System.in);
		
			int A, B, C, D, diferenca;
			
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			
			diferenca = (A*B - C*D);
			System.out.println("DIFERENCA = " + diferenca);
			
			sc.close();
			
	
	}

}
