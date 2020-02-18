package fundamentos.controle.selecao;

public class SwitchComUmBreak {

	public static void main(String[] args) {

		String faixa = "laranja";
		
		System.out.println("Qual katá você já sabe?\n");
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("O Bassai Dai da faixa preta");
		case "marrom":
			System.out.println("O Tekki Shodan da faixa marrom");
		case "roxa":
			System.out.println("O Heian Godan da faixa roxa");
		case "verde":
			System.out.println("O Heian Yodan da faixa verde");
		case "laranja":
			System.out.println("O Heian Sandan da faixa laranja");
		case "vermelha":
			System.out.println("O Heian Nidan da faixa vermelha");
		case "amarela":
			System.out.println("O Heian Shodan da faixa amarela");
		case "branca":
			System.out.println("O Bassai Shodan da faixa branca");
			break;
		default:
			System.out.println("Entrei agora no karatê e não sei nenhum katá");
		}

	}

}
