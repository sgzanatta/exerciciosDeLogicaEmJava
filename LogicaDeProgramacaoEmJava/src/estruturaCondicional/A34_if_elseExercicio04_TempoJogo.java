package estruturaCondicional;

import java.util.Scanner;

public class A34_if_elseExercicio04_TempoJogo {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode 
		//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		int horainicial, horafinal;
		int duracao;
		
		System.out.println("Que horas comecou o jogo ? ");
		horainicial = sc.nextInt();
		System.out.println("Que horas acabou o jogo ? ");
		horafinal = sc.nextInt();
		
		if (horainicial > horafinal) 
			duracao = 24 - horainicial + horafinal;
		else 
			duracao = horafinal - horainicial;
		
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();

	}

}
