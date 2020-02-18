package orientacaoObjetos.classesMetodos;

public class DataComThisTeste {

	public static void main(String[] args) {

		Data d1 = new Data();

		Data d2 = new Data(30, 12, 2020);
		// d2.dia = 30;
		// d2.mes = 12;
		// d2.ano = 2020;

		System.out.println("Data: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println("Data: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
		System.out.println();

		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		System.out.println();

		d1.imprimirData();
		d2.imprimirData();
	}

}
