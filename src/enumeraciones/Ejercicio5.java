package enumeraciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		Transporte tp, tp2, tp3;
		for (Transporte t: Transporte.values()) {
			System.out.println(t + " " + t.ordinal());
		}
		tp = Transporte.AVION;
		tp2 = Transporte.TREN;
		tp3 = Transporte.AVION;
		// Uso del CompareTo()
		if(tp.compareTo(tp2) < 0) {
			System.out.println(tp + " llega antes que " + tp2);
		}else if(tp.compareTo(tp2) > 0){
			System.out.println(tp2 + " llega antes que " + tp);
		}
		if(tp.compareTo(tp3) == 0){
			System.out.println(tp + " es igual a " + tp3);
		}
	}

}
