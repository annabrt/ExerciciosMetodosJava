package exerciciosMetodos;

public class Exercicio5 {
	//metodo com parametro e retorno
	
	public static int NumeroMaior(int numero1, int numero2) {
		if (numero1 > numero2) {
			return numero1;
		} else {
			return numero2;
		}
	}

	public static void main(String[] args) {
		
		int maior = NumeroMaior(47, 35);
		System.out.println("O maior número é o: "+ maior);
	}

}
