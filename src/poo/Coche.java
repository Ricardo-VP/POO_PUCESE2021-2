package poo;

public class Coche {
	
	// Atributos
	String color;
	String marca;
	String modelo;
	int kilometraje;

	public static void main(String[] args) {

		Coche coche1 = new Coche(); // Objeto de la clase coche
		
		coche1.color = "blanco";
		coche1.marca = "aveo";
		coche1.modelo = "family";
		coche1.kilometraje = 50000;
		
		Coche coche2 = new Coche(); // Objeto de la clase coche
		
		coche2.color = "rojo";
		coche2.marca = "chevrolet";
		coche2.modelo = "sail";
		coche1.kilometraje = 25000;
		
		System.out.println("El color del coche 2 es: " + coche2.color);
	}

}
