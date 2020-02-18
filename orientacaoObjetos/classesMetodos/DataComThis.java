package orientacaoObjetos.classesMetodos;

public class DataComThis {

	int dia;
	int mes;
	int ano;
	
	// byte, short, int, long = 0;
	// float, double = 0.0;
	// boolean = false;
	// char = '\u0000';
	
	// objetos = null;
	// String s = null;

	DataComThis() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(01, 01, 1970);
	}

	DataComThis(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterData() {
		final String formato = "Data: %d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirData() {
		System.out.println(this.obterData());
	}

}
