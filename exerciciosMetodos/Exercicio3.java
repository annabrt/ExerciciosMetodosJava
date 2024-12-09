package exerciciosMetodos;

public class Exercicio3 {
	
	//metodo com parametro e retorno
	public static int Somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		int resultado = Somar(15, 53);
		System.out.println("O resultado da soma é de: " + resultado);
	}

}
