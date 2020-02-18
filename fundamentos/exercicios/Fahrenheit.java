package fundamentos.exercicios;

public class Fahrenheit {

	public static void main(String[] args) {
		
		//converter fahrenheit para célsius
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		double fahrenheit, celsius;
		
		fahrenheit = 86;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.printf("Temperatura convertida: %.1f °C.",celsius);
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.printf("\nTemperatura convertida: %.1f °C.",celsius);
	}
}
