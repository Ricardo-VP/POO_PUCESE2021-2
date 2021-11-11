package actividad_1;

import javax.swing.JOptionPane;

public class actividad1_ejercicio1 {
		public static void main(String args[]) {
			// Ejercicio 1 del aula virtual
			// 1. Que ingrese el radio (r) y la altura corazón de un como y calcule su volumen. Sabiendo que:  V = 1/3hPIr2. 
			// El resultado del volumen debe redondearlo a 2 decimales.
						
			double radio, altura, volumen;
						
			radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));

			volumen = (1.0/3.0)*altura*Math.PI*(Math.pow(radio, 2));
						
			JOptionPane.showMessageDialog(null, "El volumen es: " + Math.round(volumen*100.0)/100.0);
		}
}
