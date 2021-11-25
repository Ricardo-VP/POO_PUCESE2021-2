package arrays;

import javax.swing.JOptionPane;

public class ejercicio_2_22112021 {

	public static void main(String[] args) {
		double[] numeros = new double[5];
		
		for(int i = 0; i < 5; i++) {
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + "= "));
		}
		
		int cont = 0;
		double sum = 0;
		
		for(double j: numeros) {
			cont++;
			sum+= j;
		}
		JOptionPane.showMessageDialog(null, "La media es = " + sum/cont);
	}

}
