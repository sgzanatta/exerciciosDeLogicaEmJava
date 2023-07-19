package estruturaCondicional;

import java.util.Scanner;

public class A38_ifElse_DiaDaSemana {

	public static void main(String[] args) {
		// EXEMPLO DE ESTRUTURA CONDICIAL "SE" DO PORTUGOL
		// Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
		// ( sendo 1 = domingo, 2 = segunda, e assim por diante). Escrever na tela o dia da semana correspondente
		// correspondente, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		int n; // numero
		String D; // dia

		System.out.print("Digite o numero para saber o dia : ");
		n = sc.nextInt();

		if (n == 1)
			D = "Domingo";
		else if (n == 2)
			D = "Segunda";
		else if (n == 3)
			D = "Terca";
		else if (n == 4)
			D = "Quarta";
		else if (n == 5)
			D = "Quinta";
		else if (n == 6)
			D = "Sexta";
		else if (n == 7)
			D = "Sabado";
		else
			D = "Valor invalido";

		sc.close();

		System.out.print("Dia da semana : " + D);

	}

}
