package actividad_1;

import javax.swing.JOptionPane;

public class actividad1_ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio 2 del aula virtual
		// La calificación final de un estudiante de TI se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen, 
		// segundo examen y examen final. Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 4%, 28%, 28% y 40%.
		// Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante (redondeo a 2 decimales). 
		
		double participacion, examen1, examen2, examenFinal;
		
		participacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de participacion (1-10):"));
		examen1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen 1 (1-10):"));
		examen2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen 2 (1-10):"));
		examenFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final (1-10):"));
		
		double calificacionFinal = (participacion*0.04)+(examen1*0.28)+(examen2*0.28)+(examenFinal*0.4);
		
		JOptionPane.showMessageDialog(null, "La calificacion final es: " + Math.round(calificacionFinal*100.0)/100.0);
	}

}
