package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class A37_OperadoresDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		// Uma operadora de telefonia conbra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
		// Cada minuto que exceder a franquia de 100 minutos custa R$2.00. Faer uma programa para ler a quantidade
		// de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int minutos;
		double conta = 50.0;
		
		System.out.print("Quantos minutos voce usou ? ");
		minutos = sc.nextInt();
		
		if (minutos > 100)
			conta += (minutos - 100) * 2;         // A += B; é igual a A = A + B;
		
		System.out.printf("Valor da conta R$%.2f%n", conta);
		
		
		sc.close();
	}

}
