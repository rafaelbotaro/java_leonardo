package fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String dia = leia.next();
		
		if (dia.equalsIgnoreCase("Domingo"))
			System.out.print("Dia 1");
		else if (dia.equalsIgnoreCase("Segunda"))
			System.out.print("Dia 2");
		else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca"))
			System.out.print("Dia 3");
		else if (dia.equalsIgnoreCase("Quarta"))
			System.out.print("Dia 4");
		else if (dia.equalsIgnoreCase("Quinta"))
			System.out.print("Dia 5");
		else if (dia.equalsIgnoreCase("Sexta"))
			System.out.print("Dia 6");
		else if (dia.equalsIgnoreCase("Sábado")  || dia.equalsIgnoreCase("Sabado"))
			System.out.print("Dia 7");
		else
			System.out.print("Dia Inválido");
		
		leia.close();
		
	}

}