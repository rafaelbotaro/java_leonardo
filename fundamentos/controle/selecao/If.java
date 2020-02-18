package fundamentos.controle.selecao;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a média do aluno: ");
		media = leia.nextDouble();
		
		if (media >= 7)
		{
			System.out.print("\nAprovado!");
			System.out.print("\nParabéns!");
		}
		if (media < 7 && media >=5)
		{
			System.out.print("\nRecuperação!");
			System.out.print("\nEstude mais!");
		}
		if (media < 5)
		{
			System.out.print("\nReprovado!");
			System.out.print("\nSe ferrou!");
		}
		leia.close();
	}

}