package fundamentos.conversoesTipos;

public class PrimitivosVsObjetos {

	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos
		
		int a = 123;
		System.out.println(a);
	}
	
}