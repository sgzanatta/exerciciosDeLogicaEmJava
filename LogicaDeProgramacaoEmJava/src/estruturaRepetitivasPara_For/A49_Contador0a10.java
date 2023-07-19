package estruturaRepetitivasPara_For;

import java.util.Scanner;

public class A49_Contador0a10 {

	public static void main(String[] args) {
		//  Contador de 0 a 10 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			System.out.print(+i+"..");
		}
		
		
		sc.close();
	}

}
