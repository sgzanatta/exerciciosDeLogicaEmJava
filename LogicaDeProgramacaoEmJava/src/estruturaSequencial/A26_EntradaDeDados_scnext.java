package estruturaSequencial;

import java.util.Scanner;

public class A26_EntradaDeDados_scnext {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Voce digitou: "+ x);
		
		
		sc.close(); 
// sc.next(); é utilizado apenas para ler palavras!!
	}

}
