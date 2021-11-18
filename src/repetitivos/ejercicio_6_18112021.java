package repetitivos;

import javax.swing.JOptionPane;

public class ejercicio_6_18112021 {

	public static void main(String[] args) {
		double sum = 0;
		double num = 0;
		double cont = 0;
		while(num>=0) {
			num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
			if(num<0) {
				JOptionPane.showMessageDialog(null, "Se ha ingresado un numero negativo. El promedio es: " + (sum/cont));
				break;
			}
			sum+=num;
			cont++;
		}

	}

}
