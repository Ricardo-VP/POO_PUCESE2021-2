package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio_4_22112021 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int matriz [][], nFilas, nCol;
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: "));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: "));
		
		matriz = new int[nFilas][nCol];
		System.out.println("MATRIZ");
		for(int i = 0; i<nFilas; i++) {
			for(int j = 0; j < nCol; j++) {
				System.out.println("Matriz[" + (i+1) + "][" + (j+1) + "] = ");			
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		for(int i = 0; i<nFilas; i++) {
			for(int j = 0; j < nCol; j++) {
				System.out.print(matriz[i][j] + " ");			
			}
			System.out.println("");
		}
	}

}
