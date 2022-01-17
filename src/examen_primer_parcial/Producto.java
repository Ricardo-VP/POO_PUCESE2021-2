package examen_primer_parcial;

public abstract class Producto {
	
	protected String nombre;
	protected double precio;
	protected int cantidad;
	
	// Constructor
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	// Metodo abstracto
	public abstract double calcular();

	@Override
	public String toString() {
		return " | Nombre = " + nombre + " | Precio = $" + precio + " | Cantidad = " + cantidad;
	}
	
}
