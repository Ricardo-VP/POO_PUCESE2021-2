package repetitivos;

import javax.swing.JOptionPane;

public class ejercicio_3_18112021 {

	public static void main(String[] args) {
		double promedio = 0;
		int i = 1;
		while(i<10) {
			JOptionPane.showMessageDialog(null, "ESTUDIANTE " + i);
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1: "));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2: "));
			promedio = (n1+n2)/2;
			if(promedio < 20) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
			i++;
		}

	}

}
