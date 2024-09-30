package herencia.herencia;
import org.springframework.boot.CommandLineRunner;
import Vehiculos.Camion;
import Vehiculos.Carro;
import Vehiculos.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Conductor.Conductor;

@SpringBootApplication
public class HerenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerenciaApplication.class, args);
		
		 Conductor conductor = new Conductor();
	        
	        // Imprimir
	     conductor.realizarPrueba();
	     
	     
	}


}
