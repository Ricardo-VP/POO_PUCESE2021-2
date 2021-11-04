package tipos_datos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//char opcion;
		Scanner entrada = new Scanner(System.in);
		//System.out.print("Ingrese el texto: ");
		//opcion = entrada.next().charAt(0);
		//System.out.print("El caracter ingresado es : " + opcion);
		
		
		// Programa que ingrese el precio de un producto
		// y calcule el IVA (12%) y el total a pagar
		
		double precio;
		System.out.print("Ingrese el precio: ");
		precio = entrada.nextDouble();
		double iva = precio * 0.12;
		double total = iva + precio;
		System.out.println("El iva es: " + iva);
		System.out.println("El total a pagar es: " + total);
		
		entrada.close();
	}

}
