package tipos_datos;

import javax.swing.JOptionPane;

public class entrada {

	public static void main(String[] args) {
		/*String cadena;
		int edad;
		float nota;
		char letra;
		
		cadena = JOptionPane.showInputDialog("Ingrese la cadena: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
		nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota: "));
		letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
		
		JOptionPane.showMessageDialog(null, "La cadena ingresada es: " + cadena);
		JOptionPane.showMessageDialog(null, "La edad ingresada es: " + edad);
		JOptionPane.showMessageDialog(null, "La nota ingresada es: " + nota);
		JOptionPane.showMessageDialog(null, "La letra es: " + letra);*/
		
		/*
		int suma, resta, producto, residuo;
		float division, a, b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: " ));
		b = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: " ));
		
		suma 		= (int) (a + b);
		resta 		= (int) (a - b);
		producto 	= (int) (a * b);
		division 	= a / b;
		residuo		=  (int) (a % b);
		
		JOptionPane.showMessageDialog(null, 
					"Suma: " + suma 
					+ "\nResta: " + resta 
					+ "\nProducto: " + producto
					+ "\nDivision: " + division 
					+ "\nResiduo: " + residuo
				);
		*/
		int c;
		c = Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));
		c += 5;
		JOptionPane.showMessageDialog(null, "El resultado es: " + c);
	}

}
