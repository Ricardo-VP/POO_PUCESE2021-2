package condicionales;

import javax.swing.JOptionPane;

public class actividad_4_11112021 {

	public static void main(String[] args) {
		int horasT;
		horasT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas trabajadas:"));
		if(horasT <= 40) {
			JOptionPane.showMessageDialog(null, "Su sueldo es: " + horasT*16);
		}else {
			double sueldo;
			sueldo = 40*16;
			horasT -= 40;
			sueldo += horasT*20;
			JOptionPane.showMessageDialog(null, "Su sueldo es: " + sueldo);
		}
	}

}
