package fundamentos.controle.selecao;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite um n�mero: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0)
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � par!");
		else
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � �mpar!");
	}

}