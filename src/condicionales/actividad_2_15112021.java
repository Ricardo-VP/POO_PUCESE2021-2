package condicionales;

import javax.swing.JOptionPane;

public class actividad_2_15112021 {

	public static void main(String[] args) {
		char operacion;
		JOptionPane.showMessageDialog(null, "a.- Área del triángulo (Ingresar base y altura)\r\n"
				+ "b.- Área del Cuadrado (Ingresar lado)\r\n"
				+ "c.- Área del Círculo (Ingresar radio)\r\n"
				+ "d.- Área del Rectángulo (Ingresar base y altura)");
		operacion = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar:").charAt(0);
		
		switch(operacion) {
		case 'a':
		case 'A':
			double base, altura;
			base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: " ));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: " ));
			JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base*altura)/2.0);
			break;
		case 'b':
		case 'B':
			double lado;
			lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado: " ));
			JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + lado*lado);
			break;
		case 'c':
		case 'C':
			double radio;
			radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: " ));
			JOptionPane.showMessageDialog(null, "El area del circulo es: " + (Math.PI*radio*radio));
			break;
		case 'd':
		case 'D':
			double base2, altura2;
			base2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: " ));
			altura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: " ));
			JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + (base2*altura2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operacion Incorrecta");
		}
	}

}
