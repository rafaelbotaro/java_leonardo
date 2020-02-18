package fundamentos.conversoesTipos;

public class TiposPrimitivos {

	public static void main(String[] args) {
	
		//informações do funcionário
		
		
		//tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numéricos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A';
		
		
		System.out.printf("O funcionário n° "+id+" recebe R$ "+salario+" reais por mês e está há "+anosDeEmpresa*365+" dias na empresa.\n"
				+ "Ele já fez "+numeroDeVoos/2+" viagens de avião e acumulou R$ %.2f real em pontos por venda realizada.\n\n"
				+ "Seu status na companhia é: "+status+". Atualmente está de féria? "+estaDeFerias+".", vendasAcumuladas/pontosAcumulados);
		
		
		
		
	}
}