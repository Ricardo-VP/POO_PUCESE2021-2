package poo;

import javax.swing.JOptionPane;

public class Operaciones {
	
	// Atributos
	float numero1;
	float numero2;
	float suma;
	float resta;
	float multiplicacion;
	float division;
	
	// Metodos
	public void ingresarNumeros() {
		numero1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1: "));
		numero2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2: "));
	}
	
	// Metodo de suma
	public void sumar() {
		suma = numero1+numero2;
	}
	
	// Metodo de resta
	public void restar() {
		resta = numero1-numero2;
	}
	
	// Metodo de multiplicacion
	public void multiplicar() {
		multiplicacion = numero1*numero2;
	}
	
	// Metodo de division
	public void division() {
		division = numero1/numero2;
	}

	// Metodo para mostrar resultados
	public void mostrarResultados() {
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicacion = " + multiplicacion);
		System.out.println("Division = " + division);
	}

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		op.ingresarNumeros();
		
		op.sumar();
		op.restar();
		op.multiplicar();
		op.division();
		
		op.mostrarResultados();
	}

}
