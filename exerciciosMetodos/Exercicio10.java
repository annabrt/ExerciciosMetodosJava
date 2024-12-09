package exerciciosMetodos;

public class Exercicio10 {
	
	public static double CalcularMedia(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}

	public static void main(String[] args) {
		double resultado = CalcularMedia(6.2, 7.3, 9.5);
		
		System.out.println("A média dos números é: " + resultado);
	}

}
