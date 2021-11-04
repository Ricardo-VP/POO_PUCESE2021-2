package tipos_datos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class math {

	public static void main(String[] args) {
		double base = 128;
		double resultado;
		
		resultado = Math.pow(base, (double) 1/5);
		System.out.println(Math.round(resultado*100.0)/100.0);
		BigDecimal r = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
		System.out.println("El resultado es : " + r);
	}

}
