package repetitivos;

import javax.swing.JOptionPane;

public class ejercicio_2_18112021 {

	public static void main(String[] args) {
		int i = 0;
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));
		while(i<n) {
			i++;
			if(i%8 == 0) {
				continue;
			}
			if(i%2 == 0) {
				System.out.println(i);
			}
		}

	}

}
