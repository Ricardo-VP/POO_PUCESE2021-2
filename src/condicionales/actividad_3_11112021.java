package condicionales;

import javax.swing.JOptionPane;

public class actividad_3_11112021 {

	public static void main(String[] args) {		
		
		char letra;
		letra = JOptionPane.showInputDialog("Ingrese la letra: ").charAt(0);
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Letra mayuscula");
		}else {
			JOptionPane.showMessageDialog(null, "Letra minuscula");
		}
	}

}
