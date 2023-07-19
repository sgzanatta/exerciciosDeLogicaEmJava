package outrosTopcosBasicosSobreJava;

public class A58_ExemploStringVect {

	public static void main(String[] args) {
		// Se usa vect para recortar uma variavel string
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
