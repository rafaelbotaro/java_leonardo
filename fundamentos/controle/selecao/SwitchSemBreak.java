package fundamentos.controle.selecao;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe aprender");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}

	}

}
