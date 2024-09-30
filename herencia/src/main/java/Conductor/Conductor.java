package Conductor;

import Vehiculos.Camion;
import Vehiculos.Carro;
import Vehiculos.Vehiculo;

public class Conductor {
	 private Vehiculo vehiculo = new Carro();
	 private Vehiculo vehi=new Camion();
	 
	 public Conductor() {}

	    // Método normal
	    public void realizarPrueba() {
	        vehiculo.conducir();
	        vehi.conducir();
	    }

}
