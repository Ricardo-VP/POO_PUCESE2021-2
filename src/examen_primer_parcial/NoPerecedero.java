package examen_primer_parcial;

public class NoPerecedero extends Producto {
	
	protected String tipo;

	public NoPerecedero(String nombre, double precio, int cantidad, String tipo) {
		super(nombre, precio, cantidad);
		this.tipo = tipo;
	}

	// Getters
	public String getTipo() {
		return tipo;
	}

	@Override
	public double calcular() {
		return (this.precio * this.cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + " | Tipo = " + tipo + " | Precio final = $" + calcular();
	}

}
