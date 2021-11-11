package condicionales;

import javax.swing.JOptionPane;

public class actividad11112021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Numero par");
		}else {
			JOptionPane.showMessageDialog(null, "Numero impar");
		}
	}

}
