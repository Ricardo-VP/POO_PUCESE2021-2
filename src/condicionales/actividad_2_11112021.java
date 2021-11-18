package condicionales;

import javax.swing.JOptionPane;

public class actividad_2_11112021 {

	public static void main(String[] args) {
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 3:"));
		
		if (a > b) {
            if (a > c) {
                System.out.println("El mayor es: " + a);                                             
            } else {
                System.out.println("el mayor es: " + c);     
            }
        } else if (b > c) {
            System.out.println("el mayor es: " + b);
        } else {
            System.out.println("el mayor es: " + c);
        }

	}

}
