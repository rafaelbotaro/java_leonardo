package fundamentos.controle.selecao;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito = " ";
		int nota = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		nota = leia.nextInt();
		System.out.println();
		
		switch (nota) {
		case 10: case 9:{
			conceito = "A";
			System.out.println("O conceito é: "+conceito);
			break;
		}
		case 8: case 7:{
			conceito = "B";
			System.out.println("O conceito é: "+conceito);
			break;
		}
		case 6: case 5:{
			conceito = "C";
			System.out.println("O conceito é: "+conceito);
			break;
		}
		case 4: case 3:{
			conceito = "D";
			System.out.println("O conceito é: "+conceito);
			break;
		}
		case 2: case 1: case 0:{
			conceito = "E";
			System.out.println("O conceito é: "+conceito);
			break;
		}
		default:
			System.out.println("Nota inválida. Digite novamente.\n");
		}
		
		leia.close();
		
	}

}
