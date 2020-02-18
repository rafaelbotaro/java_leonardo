package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!\n");
		
		System.out.printf("Resultado da MegaSena: %d %d %d %d %d %d %n",02, 17, 19, 37, 41, 44);
		System.out.printf("Salário R$ %.2f%n", 8350.80);
		System.out.printf("Nome: %s%n", "João\n");
		
		//uso do scanner par entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leia.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = leia.next();
		System.out.print("Digite sua idade: ");
		int idade = leia.nextInt();
		System.out.println("\n\nNome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+" anos.");
		System.out.printf("\n%s %s tem %d anos.%n",nome, sobrenome,idade);
		leia.close();
		
		
		
	}
}
