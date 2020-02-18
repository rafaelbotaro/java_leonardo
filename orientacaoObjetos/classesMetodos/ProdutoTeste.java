package orientacaoObjetos.classesMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notebook", 4200, 0.3);
		
		Produto p2 = new Produto();
		p2.nome = "Smartphone";
		p2.preco = 1300;
		p2.desconto = 0.2;
		
		
		System.out.println("Produto: "+p1.nome);
		System.out.println("Preço: "+p1.preco);
		System.out.println("Desconto: "+p1.desconto);
		System.out.printf("Preço Final: R$ %.2f ", p1.precoComDesconto());
		
		System.out.println("\n");
		
		System.out.println("Produto: "+p2.nome);
		System.out.println("Preço: "+p2.preco);
		System.out.println("Desconto: "+p2.desconto);
		System.out.printf("Preço Final: R$ %.2f ", p2.precoComDesconto());
		
		System.out.println("\n");
		//double precoFinal1 = p1.preco * (1 - p1.desconto);
		//double precoFinal2 = p2.preco * (1 - p2.desconto);
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.15);
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		System.out.printf("Valor médio da compra: R$ %.2f ", mediaCarrinho);
	}	

}
