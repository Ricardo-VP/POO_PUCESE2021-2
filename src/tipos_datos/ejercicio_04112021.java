package tipos_datos;

import javax.swing.JOptionPane;

public class ejercicio_04112021 {

	public static void main(String[] args) {
		/*Double radio;
		
		radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));
		
		Double area, perimetro;
		area = 2*Math.PI*radio;
		perimetro = Math.PI*(Math.pow(radio, 2));
		
		JOptionPane.showMessageDialog(null, "El area es: " + area);
		JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro);*/
		
		Double archivo;
		
		archivo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamanio en KB: "));
		JOptionPane.showMessageDialog(null, "El tamanio en bits es: " + archivo*8000);
	}

}
