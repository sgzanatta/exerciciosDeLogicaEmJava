package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class A28_Exercicio04 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
	
    // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
	// o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
	// número e o salário do funcionário, com duas casas decimais.
	// numero = nº do funcionario, horat = horas de trabalho, vhora = valor da hora, valort = salario a receber por hora trabalhada.  		
			
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
