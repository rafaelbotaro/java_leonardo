package fundamentos.conversoesTipos;

public class TiposString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s +"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println("\n");
		
		var nome = "Rafael";
		var sobrenome = "Botaro";
		var idade = 40;
		var salario = 8350.80;
		
		String maisUmaFrase = "Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalário R$ "+salario;
		System.out.println(maisUmaFrase+"\n");
		
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalário R$ "+salario);
		System.out.println();
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f reais.", nome, sobrenome, idade, salario);
		System.out.println();
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		System.out.println("\n");

		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
