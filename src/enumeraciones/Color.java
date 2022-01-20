package enumeraciones;

public enum Color {
	ROJO, VERDE, AZUL, AMARILLO, CAFE, BLANCO, NEGRO;
	
	private Color() {
		System.out.println("Constructor llamado para: " + this.toString());
	}
	
	public void colorInfo() {
		System.out.println("Color Universal");
	}
}
