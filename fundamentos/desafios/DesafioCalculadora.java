package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String op;
		double num1, num2, res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("CALCULADORA\n");
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextDouble();
		
		System.out.print("\nDigite a operação: ");
		op = leia.next();
		
		res = "+".equals(op) ? num1 + num2 : 0;
		res = "-".equals(op) ? num1 - num2 : res;
		res = "x".equals(op) ? num1 * num2 : res;
		res = "/".equals(op) ? num1 / num2 : res;
		res = "%".equals(op) ? num1 % num2 : res;
		
		System.out.printf("\n%.2f %s %.2f = %.2f", num1, op, num2, res);
		
		leia.close();
	}

}