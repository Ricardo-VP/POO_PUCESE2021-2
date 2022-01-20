package enumeraciones;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Llamando a values ()
		Color arr[] = Color.values();
		for(Color col: arr) {
			System.out.println(col + " en el inidice " + col.ordinal());
		}
	}

}
