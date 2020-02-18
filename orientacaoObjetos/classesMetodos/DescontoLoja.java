package orientacaoObjetos.classesMetodos;

public class DescontoLoja {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	DescontoLoja(){
		
	}
	
	DescontoLoja(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
