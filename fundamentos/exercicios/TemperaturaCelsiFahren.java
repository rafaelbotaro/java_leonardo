package fundamentos.exercicios;

import java.util.Scanner;

public class TemperaturaCelsiFahren {

	public static void main(String[] args) {
		
		int opcao = 0;
		double faren, celsi;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("ESCOLHA A CONVERSÃO:\n\n[1] Célsius para "
				+ "Fahrenheit\n[2] Fahrenheit para Célsius\n\nOpção: " );
		opcao = leia.nextInt();
		System.out.println();
		
		if (opcao == 1)
		{
			System.out.print("Digite a temperatura em Célsius: ");
			celsi = leia.nextDouble();
			faren = (celsi * FATOR) + AJUSTE;
			System.out.printf("Temperatura convertida: %.1f graus Fahrenheit.",faren);
		}
		else
		{
			System.out.print("Digite a temperatura em Fahrenheit: ");
			faren = leia.nextDouble();
			celsi = (faren - AJUSTE) * FATOR;
			System.out.printf("Temperatura covertida: %.1f graus Célsius.",celsi);
		}
		leia.close();		
	}
}