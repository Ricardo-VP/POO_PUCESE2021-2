package tipos_datos;

import javax.swing.JOptionPane;

public class ejercicio_08112021 {

	public static void main(String[] args) {
		
		double base, ladoIgual, resultado;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
		ladoIgual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado igual: "));
		
		resultado = Math.sqrt((Math.pow(ladoIgual, 2)-(Math.pow(base, 2)/4)));
		
		JOptionPane.showMessageDialog(null, "La altura es: " + resultado);
		
		
	}

}
