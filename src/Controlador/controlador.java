package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.modelo;
import Vista.vista;

public class controlador {
 private vista view;
 private modelo model;
 
 public controlador(vista view, modelo model) 
 {
	 this.view=view;
	 this.model=model;
	 
	 //Evento Clic del botón Sumar
	 this.view.btnSumar.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
		        	  model.setNumeroUno(Double.parseDouble(view.txtNumero1.getText()));
		        	  model.setNumeroDos(Double.parseDouble(view.txtNumero2.getText()));
		        	  model.sumar();
		        	  view.txtResultado.setText(String.valueOf(model.getResultado())); 
		           }
			 });	 
 }
 
 public void iniciar()
 {
	 view.setTitle("PROGRAMA OPERACIONES MATEMATICAS");
	 view.setLocationRelativeTo(null);
 }
}
