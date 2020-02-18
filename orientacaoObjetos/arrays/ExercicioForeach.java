package orientacaoObjetos.arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
	
		// ALUNO A
		double notasAlunoA[] = new double[3];
		notasAlunoA[0] = 8.3;
		notasAlunoA[1] = 7.8;
		notasAlunoA[2] = 6.7;
		
		double total = 0;
		for (double nota: notasAlunoA) {
			total += nota;
			System.out.print(nota+"  ");
		}
		
		System.out.println();
		System.out.println(total / notasAlunoA.length);
		System.out.println();
		
		
		// ALUNO B
		double notasAlunoB[] = {9.9, 6.8, 8.8,};
		
		double total2 = 0;
		for (double nota: notasAlunoB) {
			total2 += nota;
			System.out.print(nota+"  ");
		}
		
		System.out.println();
		System.out.println(total2 / notasAlunoB.length);

	}

}
