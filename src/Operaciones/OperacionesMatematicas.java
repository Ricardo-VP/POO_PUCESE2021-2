package Operaciones;

/**
 * Esta es la clase OperacionesMatematicas, donde se encuentran cuator metodos que retornan un valor
 * Los metodos son: suma, resta, multiplicacion y division
 * @author Ricardo
 * @version 1.0 Fecha: 17/01/2022
 */

public class OperacionesMatematicas {
	
	/**
	 * Este metodo permite realizar la suma de dos numeros enteros previamente ingresados por teclado.
	 * @param num1 Es el valor del primer numero ingresado por el usuario. Este numero debe ser int.
	 * @param num2 Es el valor del segundo numero ingresado por el usuario. Este numero debe ser int.
	 * @return sum Retorna la suma de los dos numeros;
	 */
	
	public int suma(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
	/**
	 * Este metodo permite realizar la resta de dos numeros enteros previamente ingresados por teclado.
	 * @param num1 Es el valor del primer numero ingresado por el usuario. Este numero debe ser int.
	 * @param num2 Es el valor del segundo numero ingresado por el usuario. Este numero debe ser int.
	 * @return res Retorna la resta de los dos numeros;
	 */
	
	public int resta(int num1, int num2) {
		int res;
		res = num1 - num2;
		return res;
	}
	
	/**
	 * Este metodo permite realizar la multiplicacion de dos numeros enteros previamente ingresados por teclado.
	 * @param num1 Es el valor del primer numero ingresado por el usuario. Este numero debe ser int.
	 * @param num2 Es el valor del segundo numero ingresado por el usuario. Este numero debe ser int.
	 * @return mul Retorna la resta de los dos numeros;
	 */
	
	public int multiplicacion(int num1, int num2) {
		int mul;
		mul = num1 * num2;
		return mul;
	}
	
	/**
	 * Este metodo permite realizar la division de dos numeros enteros previamente ingresados por teclado.
	 * @param num1 Es el valor del primer numero ingresado por el usuario. Este numero debe ser int.
	 * @param num2 Es el valor del segundo numero ingresado por el usuario. Este numero debe ser int.
	 * @return div Retorna la resta de los dos numeros;
	 */
	
	public int division(int num1, int num2) {
		int div;
		div = num1 * num2;
		return div;
	}
}
