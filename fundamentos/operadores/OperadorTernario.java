package fundamentos.operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7 ? "aprovado." : "reprovado.";
		System.out.println("O aluno está "+resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		String resultado = temDesconto ? "Sim." : "Não.";
	
		System.out.printf("\nAluno tem desconto? %s ", resultado);
		
	}

}