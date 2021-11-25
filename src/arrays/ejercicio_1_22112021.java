package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio_1_22112021 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nElementos;
		
		nElementos = 
		Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));
		
		char[] letras = new char[nElementos];
		String[] nombres = {"Jose", "Luis", "David", "Carla", "Monica"};
		
		System.out.println("Ingrese los elementos del vector: ");
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println("Vector [" + (i+1) + "] = ");
			letras[i] = entrada.next().charAt(0);
		}
		
		for(String k: nombres) {
			
		}
	}

}
