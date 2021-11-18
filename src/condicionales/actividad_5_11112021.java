package condicionales;

import javax.swing.JOptionPane;

public class actividad_5_11112021 {

	public static void main(String[] args) {
		
		int mes;
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes:"));
		
		switch(mes) {
			case 1:
				JOptionPane.showMessageDialog(null, "Enero | 31 dias");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Febrero | 28 dias");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Marzo | 31 dias");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Abril | 30 dias");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Mayo | 31 dias");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Junio | 30 dias");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Julio | 31 dias");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Agosto | 31 dias");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Septiembre | 30 dias");
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Octubre | 30 dias");
				break;
			case 11:
				JOptionPane.showMessageDialog(null, "Noviembre | 30 dias");
				break;
			case 12:
				JOptionPane.showMessageDialog(null, "Diciembre | 31 dias");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Mes invalido");
		}
		
	}

}
