package orientacaoObjetos.classesMetodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	String obterData(){
		return String.format("Data: %d/%d/%d", dia, mes, ano); 
	}
	
	void imprimirData(){
		System.out.println(obterData()); 
	}

}
