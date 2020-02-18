package fundamentos.conversoesTipos;

public class TiposPrimitivos {

	public static void main(String[] args) {
	
		//informa��es do funcion�rio
		
		
		//tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos num�ricos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A';
		
		
		System.out.printf("O funcion�rio n� "+id+" recebe R$ "+salario+" reais por m�s e est� h� "+anosDeEmpresa*365+" dias na empresa.\n"
				+ "Ele j� fez "+numeroDeVoos/2+" viagens de avi�o e acumulou R$ %.2f real em pontos por venda realizada.\n\n"
				+ "Seu status na companhia �: "+status+". Atualmente est� de f�ria? "+estaDeFerias+".", vendasAcumuladas/pontosAcumulados);
		
		
		
		
	}
}