package tipos_datos;

public class ejercicio2 {

	public static void main(String[] args) {
		double nota1 = 34.80;
		double nota2 = 29.75;
		double nota3 = 46.89;
		
		// Promedio
		double promedio = (nota1+nota2+nota3)/3;
		
		//System.out.println("El promedio es: " + promedio);
		
		// Programa que ingrese los lados de un rectangulo y calcule
		// el area y perimetro
		
		double lado1 = 5.6;
		double lado2 = 5.6;
		
		double area = lado1*lado2;
		double perimetro = (lado1*2) + (lado2*2);
		
		System.out.println("El area es: " + area);
		System.out.println("El perimetro es: " + perimetro);
		
	}
}
