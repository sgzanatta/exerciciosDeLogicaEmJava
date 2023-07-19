package estrutarasRepetitivasEnquanto_While;

import java.util.Scanner;

public class A48_PostoDeCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int combustivel;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Qual foi o combustivel consumido ?");
		System.out.println("-------------------------------------");
		System.out.println(" 1.Alcool 2.Gasolina 3.Diesel 4.Sair ");
		System.out.println("-------------------------------------");
		combustivel = sc.nextInt();

		while (4 != combustivel) {
			if (combustivel == 1)
				alcool = alcool + 1;
			else if (combustivel == 2)
				gasolina = gasolina + 1;
			else if (combustivel == 3)
				diesel = diesel + 1;
			else
				System.out.println("Produto Invalido");
			
			combustivel = sc.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
