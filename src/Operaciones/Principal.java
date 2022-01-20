/**
 * Este es el package Operaciones, donde estan almacenadas la clase OperacionesMatematicas 
 * y la clase Principal.
 * @version 1.0 17/01/2022
 * @author Ricardo Vaca
 */

package Operaciones;

import javax.swing.JOptionPane;

/**
 * Esta es la clase principal donde se ingreesan dos numeros enteros y se llama a cada uno de los metodos.
 * Al final se imprimen los resultados de las cuatro operaciones.
 *
 */

public class Principal {

	public static void main(String[] args) {
		OperacionesMatematicas op = new OperacionesMatematicas();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
		System.out.println("La suma es: " + op.suma(n1, n2));
		System.out.println("La resta es: " + op.resta(n1, n2));
		System.out.println("La multiplicacion es: " + op.multiplicacion(n1, n2));
		System.out.println("La division es: " + op.division(n1, n2));
	}

}
