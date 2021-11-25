package arrays;

import java.util.Scanner;

public class tarea_2_25112021 {

	public static void main(String[] args) {
		/*
		 * 2. Un programa que ingrese un vector de N elementos y los ordene de mayor a menor.
		 */
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese la longitud del vector: ");
		int n = entrada.nextInt();
		
		double[] a = new double[n];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("Vector [" + (i+1) + "]: ");
			double num = entrada.nextDouble();
			a[i] = num;	
		}
		
		for (int x = 0; x < a.length; x++) {
	        for (int i = 0; i < a.length-x-1; i++) {
	            if(a[i] < a[i+1]){
	                double tmp = a[i+1];
	                a[i+1] = a[i];
	                a[i] = tmp;
	            }
	        }
	    }
		
		System.out.println("Array ordenado de mayor a menor: ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Vector [" + (i+1) + "]: " + a[i]);
		}
		
		entrada.close();

	}

}
