package enumeraciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		Transporte tp;
		tp = Transporte.AVION;
		System.out.println("Valor de tp: " + tp);
		tp = Transporte.MOTO;
		// Comparar 2 valores con enum
		if(tp == Transporte.TREN)
			System.out.println("tp tiene el valor de TREN");
		else
			System.out.println("tp no tiene el valor de TREN");
		// Enum para controlar sentencia switch
		switch(tp) {
			case COCHE:
				System.out.println("Un auto lleva cinco personas");
				break;
			case CAMION:
				System.out.println("Un camion lleva carga");
				break;
			case AVION:
				System.out.println("Un avion vuela");
				break;
			case TREN:
				System.out.println("Un tren viaja por rieles");
				break;
			case BARCO:
				System.out.println("Un barco navega por el oceano");
				break;
			case BICICLETA:
				System.out.println("Una bicicleta lleva una persona");
				break;
			}
	}

}
