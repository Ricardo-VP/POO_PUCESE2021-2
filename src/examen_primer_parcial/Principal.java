package examen_primer_parcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Principal {
	
	public static ArrayList<Producto> productos = new ArrayList<Producto>();

	public static void main(String[] args) {
		crearProducto();
	}

	public static void crearProducto() {
		int producto, opcion;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que opcion desea realizar? \n 1. Agregar un producto \n 2. Ver productos registrados \n 3. Salir"));
			switch(opcion){
				case 1:
					do {
						producto = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de producto desea de registrar? \n 1. Perecedero \n 2. No Perecedero"));
						if(producto != 1 && producto != 2) {
							JOptionPane.showMessageDialog(null, "Opcion incorrecta");
						}
					}while(producto != 1 && producto != 2);
					
					if(producto == 1) {
						productoPerecedero();
					} else if (producto == 2) {
						productoNoPerecedero();
					}
					break;
				case 2:
					leerTxt(1);
					break;
				case 3:
					leerTxt(2);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		}while(opcion == 1 || opcion == 2);
	}
	
	public static void productoPerecedero() {
		String nombre = JOptionPane.showInputDialog("Ha elegido producto perecedero \n Ingrese el nombre: ");
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio : "));
		int dias_caducar;
		do {
			dias_caducar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias restantes de caducacion: "));
			if(dias_caducar < 1) {
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		}while(dias_caducar < 1);
		Perecedero p = new Perecedero(nombre, precio, cantidad, dias_caducar);
		JOptionPane.showMessageDialog(null, p.toString());
		productos.add(p);
		crearTxt();
	}
	
	public static void productoNoPerecedero() {
		String nombre2 = JOptionPane.showInputDialog("Ha elegido producto perecedero \n Ingrese el nombre: ");
		int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
		double precio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio : "));
		String tipo = JOptionPane.showInputDialog("Ingrese el tipo (ejem. azúcar, arroz, sal, aceita, vegetales, etc): ");
		NoPerecedero p2 = new NoPerecedero(nombre2, precio2, cantidad2, tipo);
		JOptionPane.showMessageDialog(null, p2.toString());
		productos.add(p2);
		crearTxt();
	}
	
	public static void crearTxt() {
			try(
	            BufferedWriter bw = new BufferedWriter(new FileWriter("PRODUCTOS.txt"));
				){
	            //Escribimos en el fichero
				for(Producto p : productos) {
					bw.write(p.toString());
					bw.newLine();
				}
	            //Guardamos los cambios del fichero
	            bw.flush();
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);
	        }
	}
	
	public static void leerTxt(int accion) {
		try(
				BufferedReader br = new BufferedReader(new FileReader("PRODUCTOS.txt"));
				){
	            //Leemos el fichero y lo mostramos por pantalla
	            String linea=br.readLine();
	            if(accion == 1) {
	            	if(linea != null) {
		            	JOptionPane.showMessageDialog(null, "Revisa los registros en la consola");
		            }
	            }
	            while(linea!=null){
	                System.out.println(linea);
	                linea=br.readLine();
	            }
	        }catch(IOException e){
	        	if(accion == 1) {
	        		JOptionPane.showMessageDialog(null, "Aun no hay registros");
	        	}
	        }
	}
}
