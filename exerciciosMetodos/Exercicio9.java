package exerciciosMetodos;

public class Exercicio9 {
	
	public static String ConcatenarStrings(String str1, String str2) {
		return str1 + str2;
	}
	
	public static void main(String[] args) {
		
		String resultado = ConcatenarStrings("Oieee, ", "pessoas!");
		
		System.out.println("Resultado da concatenação: " + resultado);
		
	}

}
