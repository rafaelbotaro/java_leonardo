package orientacaoObjetos.classesMetodos.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rafael Botaro", 70.0);
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.200);
		Comida c3 = new Comida("Ovo", 0.100);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c3);
		System.out.println(p1.apresentar());
	}

}
