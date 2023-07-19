package estruturaSequencial;

import java.util.Scanner;

public class A26_EntradaDeDados_scnextInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou: "+ x);
			
		sc.close();

	// sc.mextInt(); é utilizado para ler apenas numeros INTEIROS.			
	}

}
