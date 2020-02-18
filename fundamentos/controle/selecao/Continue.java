package fundamentos.controle.selecao;

public class Continue {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		for (i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		for (i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}
	
}
