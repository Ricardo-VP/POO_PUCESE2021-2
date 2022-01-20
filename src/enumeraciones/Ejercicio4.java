package enumeraciones;

public class Ejercicio4 {

	public static void main(String[] args) {
		Transporte1 tp;
		tp = Transporte1.AVION;
		System.out.println("La velocidad para un avion es: " + tp.getVelocidad() + " Km/h");
		// Mostrar todas las velocidades
		for(Transporte1 t: Transporte1.values()) {
			System.out.println(t + " la velocidad es " + t.getVelocidad() + " Km/h");
		}
	}

}
