package pe.idat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.idat.concierto.Banda;

@SpringBootApplication
public class AppSpringApplication implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);
	}

	//método ejecutable
	@Override
	public void run(String... args) throws Exception 
	{
		//banda
		Banda chicosATE=new Banda();
		
		//imprimir
		chicosATE.realizarPrueba();
	}
}
