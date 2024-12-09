package exerciciosMetodos;

public class Exercicio8 {

	public static int CalcularFatorial(int numero) {
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static void main(String[] args) {
		int numeroTeste = 5;
		int resultado = CalcularFatorial(numeroTeste);
		
		System.out.println("O fatorial de " + numeroTeste + " é: " + resultado);
		
	}

}
