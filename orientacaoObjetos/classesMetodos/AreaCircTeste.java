package orientacaoObjetos.classesMetodos;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(9);
		a1.raio = 11;
		// a1.pi = 10;
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 20;
		// a2.pi = 10;
		System.out.println(a2.area());

		// AreaCirc.pi = 3.14159;
		
		System.out.println(a1.area());
		System.out.println(a2.area());	
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(100));
	}

}
