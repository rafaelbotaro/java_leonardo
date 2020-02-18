package fundamentos.desafios;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true, trabalho2 = !true;	
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean semSorvete = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? R: "+comprouTV50);
		System.out.println("Comprou TV 32\"? R: "+comprouTV32);
		System.out.println("Comprou o sorvete? R: "+comprouSorvete);
		System.out.println("Não comprou sorvete. R: "+semSorvete);
	}

}