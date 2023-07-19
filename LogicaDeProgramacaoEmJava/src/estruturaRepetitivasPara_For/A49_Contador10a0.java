package estruturaRepetitivasPara_For;

import java.util.Scanner;

public class A49_Contador10a0 {

	public static void main(String[] args) {
		//Contador regressivo 10 a 0
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 10; i >= n; i--) {
			System.out.println(+i+"..");
		}	
		sc.close();
	}

}
