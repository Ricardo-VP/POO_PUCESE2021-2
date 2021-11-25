package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio_5_22112021 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int matriz [][], nFilas, nCol;
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: "));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: "));
		
		
		if(nFilas != nCol) {
			System.out.println("No es simetrica. Vuelva a intentarlo");
			return;
		}
		
		matriz = new int[nFilas][nCol];
		
		System.out.println("MATRIZ");
		for(int i = 0; i<nFilas; i++) {
			for(int j = 0; j < nCol; j++) {
				System.out.println("Matriz[" + (i+1) + "][" + (j+1) + "] = ");			
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		boolean x = true;
		
		for(int i = 0; i<nFilas; i++) {
			for(int j = 0; j < nCol; j++) {
				if(matriz[i][j] != matriz[j][i]) {
					x = false;
					System.out.println("No es simetrica. Vuelva a intentarlo");
					return;
				}
			}
		}
		System.out.println("Es simetrica.");
	}

}
