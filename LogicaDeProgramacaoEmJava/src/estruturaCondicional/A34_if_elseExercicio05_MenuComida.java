package estruturaCondicional;

import java.util.Scanner;

public class A34_if_elseExercicio05_MenuComida {

	public static void main(String[] args) {
	//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
	//seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double total ;				 
		
		System.out.println("------------------------------------");
		System.out.println(" CODIGO    ESPECIFICAÇÃO    PREÇO   ");
		System.out.println("    1     Cachorro quente   R$4,00  ");
		System.out.println("    2       X-Salada        R$4,50  ");
		System.out.println("    3       X-Bacon         R$5,00  ");
		System.out.println("    4     Torrada simples   R$2,00  ");
		System.out.println("    5      Refrigerante     R$1,50  ");
		System.out.println("------------------------------------");
		
		System.out.println("Qual lanche voce quer ? ");
		codigo = sc.nextInt();
		System.out.println("Quantos voce quer ? ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;					
		}
		else if  (codigo == 2) {
			total = quantidade * 4.5;					
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;			
		}
		else if (codigo ==  4) { 
			total = quantidade * 2.00;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);
		
		sc.close();
	}

}
