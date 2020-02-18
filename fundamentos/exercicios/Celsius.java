package fundamentos.exercicios;

public class Celsius {

	public static void main(String[] args) {
		
		//converter célsius para fahrenheit
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		double fahrenheit, celsius;
		
		celsius = 36;
		fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.printf("Temperatura convertida: %.1f °F.",fahrenheit);
		
		celsius = 0;
		fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.printf("\nTemperatura convertida: %.1f °F.",fahrenheit);
	}
}