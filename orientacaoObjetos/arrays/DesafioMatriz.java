package orientacaoObjetos.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double soma = 0, media = 0;
		int i = 0, j = 0, qtdNotas = 0, qtdAlunos = 0;

		System.out.print("Quantidade de alunos: ");
		qtdAlunos = leia.nextInt();

		System.out.print("Quantas notas por aluno: ");
		qtdNotas = leia.nextInt();
		System.out.println();

		double notas[][] = new double[qtdAlunos][qtdNotas];

		for (i = 0; i < notas.length; i++) {
			for (j = 0; j < notas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j+1, i+1);
				notas[i][j] = leia.nextDouble();
				soma += notas[i][j];
			}
		}
		
		media = soma / (qtdAlunos * qtdNotas);
		System.out.printf("\nMédia da turma: "+media);
		
		System.out.println("\n\n\nMatriz com as notas:\n");
		for (double notasDosAlunos[]: notas) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}

		leia.close();
	}

}
