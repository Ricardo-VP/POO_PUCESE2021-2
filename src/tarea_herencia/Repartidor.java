package tarea_herencia;

public class Repartidor extends Empleado {
	
	private int zona ;

	public Repartidor(String nombre, int edad, double salario, int zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public int getZona() {
		return zona;
	}

	@Override
	public double calcularSalario() {
		if(this.edad < 25 && this.zona == 3) {
			double salarioTotal = this.salario + this.PLUS;
			return salarioTotal;
		}else {
			return this.salario;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nZona = " + zona + "\nSalario final = $" + this.calcularSalario();
	}

	
}
