package estruturaSequencial;


import java.util.Scanner;

public class A26_EntradaDeDados_Todas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();		
		
		System.out.println("Dados digitados: ");
		System.out.println("Qual é seu nome? " + x);
		System.out.println("Quantos anos voce tem ? " + y);
		System.out.println("Quanto voce ganha ? " + z);
		System.out.println(x + " tem " + y + " anos e ganha: " + z);
		
		
		sc.close();
		

	}

}
