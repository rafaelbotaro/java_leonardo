package fundamentos.operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		
		System.out.println("\nAluno tem desconto? "+temDesconto);
		
	}

}