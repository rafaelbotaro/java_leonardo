package fundamentos.controle.selecao;

public class BreakRotulado {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		externo: for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d%d]", i, j);
			}
			System.out.println();
		}
		System.out.println("\nFim!");
	}

}
