package poo;

import javax.swing.JOptionPane;

public class Operacion {
	
	// Metodo de suma
	public float sumar(float numero1, float numero2) {
		float suma = numero1+numero2;
		return suma;
	}
	
	// Metodo de resta
	public float restar(float numero1, float numero2) {
		float resta = numero1-numero2;
		return resta;
	}
	
	// Metodo de multiplicacion
	public float multiplicar(float numero1, float numero2) {
		float multiplicacion = numero1*numero2;
		return multiplicacion;
	}
	
	// Metodo de division
	public float division(float numero1, float numero2) {
		float division = numero1/numero2;
		return division;
	}

	// Metodo para mostrar resultados
	public void mostrarResultados(float suma, float resta, float multiplicacion, float division) {
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicacion = " + multiplicacion);
		System.out.println("Division = " + division);
	}

	public static void main(String[] args) {
		Operacion op = new Operacion();
		
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2: "));
	
		float s = op.sumar(n1, n2);
		float r = op.restar(n1, n2);
		float m = op.multiplicar(n1, n2);
		float d = op.division(n1, n2);
		
		op.mostrarResultados(s,r,m,d);
	}

}
