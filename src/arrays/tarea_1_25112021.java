package arrays;

import java.util.Scanner;

public class tarea_1_25112021 {

	public static void main(String[] args) {
		/*
		 * 1. Un programa que permita ingresar un vector de N elementos e imprima la posición y el número menor. 
		 */
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese la longitud del vector: ");
		int n = entrada.nextInt();
		
		double[] vector = new double[n];
		
		String a = "";
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Vector [" + (i+1) + "]: ");
			double num = entrada.nextDouble();
			vector[i] = num;	
		}
		
		double menor = vector[0];	
		
		for(int i = 0; i < vector.length; i++) {
			a = "El menor elemento es: Vector[" + (i+1) + "] : " + menor;
			 if(vector[i]<menor) {
	              menor = vector[i];
	              a = "El menor elemento es: Vector[" + (i+1) + "] : " + menor;
	         }
		}
		
		System.out.println(a);
		
		entrada.close();
	} 

}
