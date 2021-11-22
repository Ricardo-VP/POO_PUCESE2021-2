package repetitivos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class tarea_1_22112021 {
	
	final static String globalPassword = "1234";

	public static void main(String[] args) {
		
		String password = JOptionPane.showInputDialog("Ingrese la clave: ");
		
		if(!password.equals(globalPassword)) {
			JOptionPane.showMessageDialog(null, "Clave incorrecta. Vuelva a ingresar");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Bienvenido, Ricardo Vaca");
		
		int opcion = 0;
		
		double SALDO = 500.00;
		
		ArrayList<String> MOVIMIENTOS = new ArrayList<String>();
		String HISTORIAL = null;
		
		do {
			
			int menu = Integer.parseInt(JOptionPane.showInputDialog
					("1. Ingresar dinero a la cuenta.\r\n"
							+ "2. Retirar dinero de la cuenta.\r\n"
							+ "3. Consultas.\r\n"
							+ "4. Salir."
					));
			
			switch(menu) {
			case 1:
				double INGRESO = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a ingresar: "));
				if(INGRESO<=0){
					JOptionPane.showMessageDialog(null, "Monto incorrecto");
					break;
				}
				SALDO += INGRESO;
				MOVIMIENTOS.add("+" + INGRESO);
				break;
			case 2:
				double EGRESO = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
				if(EGRESO > SALDO) {
					JOptionPane.showMessageDialog(null, "Monto incorrecto");
					break;
				}
				SALDO -= EGRESO;
				MOVIMIENTOS.add("-" + EGRESO);
				break;
			case 3:
				HISTORIAL = "";
				for(String i : MOVIMIENTOS) {
					HISTORIAL += i + '\n';
				}
				JOptionPane.showMessageDialog(null, "SALDO ACTUAL: " + (Math.round(SALDO*100.00)/100.00) + "\n" + HISTORIAL);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Gracias por usar el programa :)");
				return;
			default:
				JOptionPane.showMessageDialog(null,"Opcion incorrecta. Vuelva a intentarlo.");
			}
		}while(opcion != 4);
	}

}
