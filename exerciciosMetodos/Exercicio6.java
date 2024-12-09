package exerciciosMetodos;

public class Exercicio6 {

	//metodo com parametro e retorno booleano
	public static boolean EhPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static void main(String[] args) {
		int numeroTeste = 9;
		boolean resultado = EhPar(numeroTeste);
		
		if (resultado) {
			System.out.println(numeroTeste + " é par.");
		} else {
			System.out.println(numeroTeste + " é ímpar.");
		}

	}

}
