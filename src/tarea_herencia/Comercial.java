package tarea_herencia;

public class Comercial extends Empleado {
	
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	public double getComision() {
		return comision;
	}

	@Override
	public double calcularSalario() {
		if(this.edad > 30 && this.comision > 200) {
			double salarioTotal = super.PLUS + this.getSalario();
			return salarioTotal;
		}else {
			return this.getSalario();
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nComision = $" + comision + "\nSalario final = $" + this.calcularSalario() + this.salarioComision();
	}
	
	public String salarioComision() {
		double salarioFinal = this.calcularSalario() + this.comision;
		return "\nSalario final + comision = $" + salarioFinal;
	}

}
