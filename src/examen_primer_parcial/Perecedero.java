package examen_primer_parcial;

public class Perecedero extends Producto {
	
	private int dias_caducar;

	public Perecedero(String nombre, double precio, int cantidad, int dias_caducar) {
		super(nombre, precio, cantidad);
		this.dias_caducar = dias_caducar;
	}

	// Getters
	public int getDias_caducar() {
		return dias_caducar;
	}

	@Override
	public double calcular() {
		double calculo = this.precio * this.cantidad;
		if(this.dias_caducar == 1) {
			calculo = calculo - (calculo*0.8);
		}else if(this.dias_caducar == 2) {
			calculo = calculo - (calculo*0.6);
		}else if(this.dias_caducar == 3) {
			calculo = calculo - (calculo*0.3);
		}
		return calculo;
	}

	@Override
	public String toString() {
		return super.toString() + " | Dias caducar = " + getDias_caducar() + " | Precio final = $" + calcular();
	}

}
