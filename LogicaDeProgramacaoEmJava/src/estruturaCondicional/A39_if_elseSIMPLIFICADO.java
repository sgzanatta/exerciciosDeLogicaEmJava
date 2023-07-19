package estruturaCondicional;

import java.util.Scanner;

public class A39_if_elseSIMPLIFICADO {

	public static void main(String[] args) {
		//        double preco = 34.5;
		//        double desconto;
		
		//        if (preco < 20.0) 
		//	      desconto = preco * 0.1;
		//        else 
		//	      desconto = preco * 0.05;
		//        sc.close();	
		//        System.out.println("desconto");
		
		Scanner sc = new Scanner(System.in);
			
			double preco = 34.5;
			double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
			
			System.out.println(desconto);

			sc.close();
	}

}
