package tarea_herencia;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public static void main(String[] args) {
		crearEmpleado();
	}

	
	public static void crearEmpleado() {
		
		int empleado, opcion;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que opcion desea realizar? \n 1. Crear un empleado \n 2. Salir"));
			switch(opcion){
				case 1:
					do {
						empleado = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de empleado desea de registrar? \n 1. Comercial \n 2. Repartidor"));
						if(empleado != 1 && empleado != 2) {
							JOptionPane.showMessageDialog(null, "Opcion incorrecta");
						}
					}while(empleado != 1 && empleado != 2);
					
					if(empleado == 1) {
						empleadoComercial();
					} else if (empleado == 2) {
						empleadoRepartidor();
					}
					break;
				case 2:
					int cont = 1;
					System.out.println();
					for(Empleado e : empleados) {
						System.out.println("Empleado " + cont + " :");
						System.out.println(e.toString());
						System.out.println();
						cont++;
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		}while(opcion == 1);
	}
	
	public static void empleadoComercial() {
		String nombre = JOptionPane.showInputDialog("Ha elegido empleado comercial \n Ingrese el nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario : "));
		double comision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la comision: "));
		Comercial e = new Comercial(nombre, edad, salario, comision);
		JOptionPane.showMessageDialog(null, e.toString());
		empleados.add(e);
	}
	
	public static void empleadoRepartidor() {
		String nombre2 = JOptionPane.showInputDialog("Ha elegido empleado comercial \n Ingrese el nombre: ");
		int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
		double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario : "));
		int zona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la zona (ejem. 2): "));
		Repartidor e2 = new Repartidor(nombre2, edad2, salario2, zona);
		JOptionPane.showMessageDialog(null, e2.toString());
		empleados.add(e2);
	}
}
