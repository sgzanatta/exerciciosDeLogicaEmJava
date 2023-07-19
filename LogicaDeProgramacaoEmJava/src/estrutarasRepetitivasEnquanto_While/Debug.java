package estrutarasRepetitivasEnquanto_While;

import java.util.Locale;
import java.util.Scanner;

public class Debug {

	public static void main(String[] args) {
		//� Para marcar uma linha de breakpoint:
		//		� Run -> Toggle Breakpoint
		//� Para iniciar o debug:
		//		� Bot�o direito na classe -> Debug as -> Java Application
		//� Para executar uma linha:
		//		� F6
		//� Para interromper o debug:
		//     	� botao vermelhor para parar execucao 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}

}
