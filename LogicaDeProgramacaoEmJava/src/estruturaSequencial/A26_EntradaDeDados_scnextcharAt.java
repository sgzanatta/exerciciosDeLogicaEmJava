package estruturaSequencial;

import java.util.Scanner;

public class A26_EntradaDeDados_scnextcharAt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next() .charAt(0);
		
		
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		
		// sc.next() .charAt(0); é utilizado com o char, ele faz uma leitura de 1 caractere.
	}

}
