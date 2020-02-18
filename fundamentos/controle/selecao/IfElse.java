package fundamentos.controle.selecao;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite um número: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0)
			JOptionPane.showMessageDialog(null, "O número "+numero+" é par!");
		else
			JOptionPane.showMessageDialog(null, "O número "+numero+" é ímpar!");
	}

}