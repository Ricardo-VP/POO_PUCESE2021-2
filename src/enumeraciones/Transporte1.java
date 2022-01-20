package enumeraciones;

public enum Transporte1 {
	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
	private int velocidad;
	// Metodo constructor
	Transporte1(int vel){
		velocidad = vel;
	}
	// Agregando metodo de retorno
	int getVelocidad() {
		return velocidad;
	}
}
