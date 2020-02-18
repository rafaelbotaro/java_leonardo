package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia, X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Olá, Rafael.".toUpperCase();
		System.out.print(x);
		System.out.println(" Bom dia!".toUpperCase());
		
		String y = "Bom dia, X".replace("X", "Ale!").toUpperCase().concat("!!!!");
		System.out.println(y);
		
	}
}
