package estruturaSequencial;

import java.util.Scanner;

public class A28_Exercicios01 {

	public static void main(String[] args) {
		
//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma 
//mensagem explicativa, conforme exemplos
		
		Scanner sc = new Scanner (System.in);
		
			int a, b, total;
		
			a = sc.nextInt();
			b = sc.nextInt();
			total = a+b;
		
			System.out.println("SOMA = " + total);
		
		sc.close();
		

	}

}
