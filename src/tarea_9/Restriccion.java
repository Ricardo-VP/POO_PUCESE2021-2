package tarea_9;

public class Restriccion {
	String nota1, nota2, nota3;

	public Restriccion(String nota1, String nota2, String nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public boolean validarNota(String nota) {
		return nota.matches("[0-9]*.[0-9]*{5}");
	}
}
