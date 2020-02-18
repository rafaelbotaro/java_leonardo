package orientacaoObjetos.arrays;

public class UsuarioEqualsTeste {
	
	public static void main(String[] args) {
		
		UsuarioEquals u1 = new UsuarioEquals();
		u1.nome = "Pedro Silva";
		u1.email = "psilva@email.com";
		
		UsuarioEquals u2 = new UsuarioEquals();
		u2.nome = "Pedro Silva";
		u2.email = "psilva@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
