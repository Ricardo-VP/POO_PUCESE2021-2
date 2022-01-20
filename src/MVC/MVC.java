package MVC;

import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;

public class MVC {

	public static void main(String[] args) {
		modelo mod = new modelo();
		vista view = new vista();
		controlador cont = new controlador(view,mod);
		cont.iniciar();
		view.setVisible(true);
	}
}
