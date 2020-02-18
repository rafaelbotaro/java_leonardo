package orientacaoObjetos.arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 8.5;
		notasAlunoA[1] = 7.0;
		notasAlunoA[2] = 6.5;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); ERRO: Excedeu capacidade do array
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		System.out.println();
		
		double notaArmazenada = 8.8;
		double notasAlunoB[] = {9.9, 6.8, notaArmazenada, 8.2};
		System.out.println(Arrays.toString(notasAlunoB));
		
		double total2 = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total2 += notasAlunoB[i];
		}
		
		System.out.println(total2 / notasAlunoB.length);
	}

}
