package tarea_herencia;

public abstract class Empleado {
	protected String nombre;
	protected int edad;
	protected double salario;
	
	protected final double PLUS = 300.00;

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public abstract double calcularSalario();
	
	@Override
	public String toString() {
		return "Nombre = " + nombre + "\nEdad = " + edad + "\nSalario inicial = $" + this.salario;
	}
}
