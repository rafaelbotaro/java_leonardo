package fundamentos.conversoesTipos;

import javax.swing.JOptionPane;

public class ConvStringNum2 {
	
	public static void main(String[] args) {
		
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		double media = (valor1 + valor2) / 2;
		
		JOptionPane.showMessageDialog(null, "Média: "+media);
		
	}

}