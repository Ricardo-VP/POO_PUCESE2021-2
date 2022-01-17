package tablas;

public class Restriccion {
	String cedula, salario;

	public Restriccion(String cedula, String salario) {
		this.cedula = cedula;
		this.salario = salario;
	}

	public boolean validarCedula(String cedula) {
		return cedula.matches("[0-9]{10}");
	}
	
	public boolean validarSalario(String salario) {
		return salario.matches("[0-9]*.[0-9]*");
	}
}
