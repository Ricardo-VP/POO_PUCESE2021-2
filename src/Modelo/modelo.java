package Modelo;

public class modelo {
  private double numeroUno;
  private double numeroDos;
  private double resultado;
  
 public double getNumeroUno() {
	return numeroUno;
 }
 public void setNumeroUno(double numeroUno) {
	this.numeroUno = numeroUno;
 }
 public double getNumeroDos() {
	return numeroDos;
 }
 public void setNumeroDos(double numeroDos) {
	this.numeroDos = numeroDos;
 }
 public double getResultado() {
	return resultado;
 }
 public void setResultado(double resultado) {
	this.resultado = resultado;
 }
 
 //M�todo que permite sumar los dos n�meros.
 public double sumar() {
	 this.resultado=this.numeroUno+this.numeroDos;
	 return this.resultado;
 } 
}
