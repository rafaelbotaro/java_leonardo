package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		String salario1, salario2, salario3;
		double sal1, sal2, sal3, total, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primerio salário: ");
		salario1 = leia.next().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		salario2 = leia.next().replace(",", ".");
		
		System.out.print("Digite o terceiro salário: ");
		salario3 = leia.next().replace(",", ".");
		System.out.println();
		
		sal1 = Double.parseDouble(salario1);
		sal2 = Double.parseDouble(salario2);
		sal3 = Double.parseDouble(salario3);
		
		total = (sal1 + sal2 + sal3);
		media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("Total recebido em 3 meses: R$ %.2f reais.", total);
		System.out.printf("\nMédia dos 3 últimos salários: R$ %.2f reais.", media);
				
		leia.close();
	}
	
}
