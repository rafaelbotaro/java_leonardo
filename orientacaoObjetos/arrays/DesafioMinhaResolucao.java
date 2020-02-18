package orientacaoObjetos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioMinhaResolucao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double soma = 0;
		int i = 0, cont = 1, qtdNotas = 0;

		System.out.print("Quantas notas vai digitar: ");
		qtdNotas = leia.nextInt();
		System.out.println();
		
		double notas[] = new double[qtdNotas];
	
		for (i = 0; i < notas.length; i++) {
			System.out.print("Digite a "+cont+"a. nota: ");
			notas[i] = leia.nextDouble();
			cont++;
		}
		
		for (double nota: notas) {
			soma += nota;
		}

		System.out.printf("Média: %.2f%n", soma / notas.length);

		leia.close();
	}

}
