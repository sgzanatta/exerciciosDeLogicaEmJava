package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class A28_Exercicio02 {

	public static void main(String[] args) {
		
//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
//casas decimais conforme exemplos
//F�rmula da �rea: area = pi . raio2
//Considere o valor de pi = 3.14159
		
		    Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi*raio*raio;
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();
				
	   

	}

}
