package arrays;

import javax.swing.JOptionPane;

public class ejercicio_3_22112021 {

	public static void main(String[] args) {
		double[] numeros = new double[10];
		double[] numeros2 = new double[10];
		double[] numeros3 = new double[20];
		
		for(int i = 0; i < 10; i++) {
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Vector 1: Ingrese el numero " + (i+1) + "= "));
		}

		for(int i = 0; i < 10; i++) {
			numeros2[i] = Double.parseDouble(JOptionPane.showInputDialog("Vector 2: Ingrese el numero " + (i+1) + "= "));
		}
		
		int j = 0;
		for(int i = 0; i < 10; i++) {
			numeros3[j] = numeros[i];
			j++;
			numeros3[j] = numeros2[i];
			j++;
		}
		
		System.out.println("Vector 3: ");
		for(double a: numeros3) {
			System.out.println(a);
		}
	}

}
