package enumeraciones;

public enum ItemType {
	Primero("1er. nivel"),
	Segundo("2do. nivel"),
	Tercero("3er. nivel"),
	Cuarto("4to. nivel");
	private String imp_nivel;
	
	private ItemType(String s) {
		imp_nivel = s;
	}
	
	public String toString() {
		return imp_nivel;
	}
}
