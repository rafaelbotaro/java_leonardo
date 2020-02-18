package fundamentos.exercicios;

import java.util.Scanner;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 0;
		final double PI = 3.14159265359;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor do raio: ");
		raio = leia.nextDouble();
		
		double area = PI * raio * raio;
		
		System.out.println("A Área da Circunferência é "+area+" m2.");
		leia.close();
	}

}
