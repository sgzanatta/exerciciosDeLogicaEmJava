package estruturaCondicional;

import java.util.Scanner;

public class A38_EstruturaCondicional_02_SwitchCase {

	public static void main(String[] args) {
		// EXEMPLO DE EXTRUTURA CONDICIAL "ESCOLHA" DO PORTUGOL 
		// Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		// semana
		// ( sendo 1 = domingo, 2 = segunda, e assim por diante). Escrever na tela o dia
		// da semana correspondente
		// correspondente, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		int N; // numero
		String D; // dia

		System.out.println("Digite o numero para saber o dia: ");
		N = sc.nextInt();

		switch (N) {
		case 1:
			D = "Domingo";
			break;
		case 2:
			D = "Segunda";
			break;
		case 3:
			D = "Terca";
			break;
		case 4:
			D = "Quarta";
			break;
		case 5:
			D = "Quinta";
			break;
		case 6:
			D = "Sexta";
			break;
		case 7:
			D = "Sabado";
			break;
		default:
			D = "Valor invalido";
			break;
		}

		System.out.println("Dia da semana: " + D);

		sc.close();

	}

}
