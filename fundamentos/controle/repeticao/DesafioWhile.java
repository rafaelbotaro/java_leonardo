package fundamentos.controle.repeticao;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.print("Informa uma nota (ou -1 para sair): ");
			nota = leia.nextDouble();
		
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}else if (nota != -1) {
				System.out.println("Nota Inválida. Digite Novamente.");
			}
		}

		double media = total / quantidadeDeNotas;
		System.out.println("Média: "+media);
		leia.close();

	}

}
