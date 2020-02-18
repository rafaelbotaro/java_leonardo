package orientacaoObjetos.classesMetodos;

public class DescontoLojaTeste {

	public static void main(String[] args) {

		DescontoLoja desc1 = new DescontoLoja("Notebook", 4200);
		
		System.out.println("Produto: "+desc1.nome);
		System.out.println("Preço: "+desc1.preco);
		System.out.println("Desconto: "+DescontoLoja.desconto);
		System.out.printf("Preço Final: R$ %.2f ", desc1.precoComDesconto());
		
		System.out.println("\n");
		
		DescontoLoja desc2 = new DescontoLoja();
		desc2.nome = "Smartphone";
		desc2.preco = 1300;
		DescontoLoja.desconto = 0.5; // alterei o desconto do segundo produto
		
		System.out.println("Produto: "+desc2.nome);
		System.out.println("Preço: "+desc2.preco);
		System.out.println("Desconto: "+DescontoLoja.desconto);
		System.out.printf("Preço Final: R$ %.2f ", desc2.precoComDesconto());
		
		System.out.println("\n");
		
		double precoFinal1 = desc1.precoComDesconto();
		double precoFinal2 = desc2.precoComDesconto();
		double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
		System.out.printf("Valor médio da compra: R$ %.2f ", mediaCarrinho);
	}

}
