package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class A28_Exercicio04 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
	
    // Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
	// o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o 
	// n�mero e o sal�rio do funcion�rio, com duas casas decimais.
	// numero = n� do funcionario, horat = horas de trabalho, vhora = valor da hora, valort = salario a receber por hora trabalhada.  		
			
		int numero, horat;
		double vhora, valort;
		
		numero = sc.nextInt();
		horat = sc.nextInt();
		vhora = sc.nextDouble();
		
		valort = horat * vhora;
		
		System.out.println("NUMER = " + numero);
		System.out.printf("SALARY = U$ %.2f", valort);
		
		sc.close();

	}

}
