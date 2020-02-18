package fundamentos.controle.selecao;

import java.util.Scanner;

public class IfElseIf3 {

	public static void main(String[] args) {

		double nota;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		nota = leia.nextDouble();
		
		if (nota < 0 && nota > 10)
			System.out.print("\nNota inválida!");
		else if (nota >= 8.1)
			System.out.print("\nConceito A");
		else if (nota >= 6.1)
			System.out.print("\nConceito B");
		else if (nota >= 4.1)
			System.out.print("\nConceito C");
		else if (nota >= 2.1)
			System.out.print("\nConceito D");
		else			
			System.out.print("\nConceito E");
		
		System.out.print("\nFim!!");
		leia.close();
	}
	
}