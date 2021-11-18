package condicionales;

import javax.swing.JOptionPane;

public class actividad_1_15112021 {

	public static void main(String[] args) {
		char operacion;
		double a, b;
		
		operacion = JOptionPane.showInputDialog("Ingrese la operacion (S, R, P o D):").charAt(0);
		a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2: "));
		
		if(operacion == 'S' || operacion == 's') {
			JOptionPane.showMessageDialog(null, "La suma es: " + (a+b));
		}else if(operacion == 'R' || operacion =='r') {
			JOptionPane.showMessageDialog(null, "La resta es: " + (a-b));
		}else if(operacion == 'P' || operacion =='p') {
			JOptionPane.showMessageDialog(null, "La multiplicacion es: " + (a*b));
		}else if(operacion == 'D' || operacion =='d') {
			JOptionPane.showMessageDialog(null, "La division es: " + (a/b));
		}else {
			JOptionPane.showMessageDialog(null, "Operacion Incorrecta");
		}
	}

}
