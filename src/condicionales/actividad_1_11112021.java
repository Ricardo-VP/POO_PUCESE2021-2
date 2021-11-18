package condicionales;

import javax.swing.JOptionPane;

public class actividad_1_11112021 {

	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Numero par");
		}else {
			JOptionPane.showMessageDialog(null, "Numero impar");
		}

	}

}
