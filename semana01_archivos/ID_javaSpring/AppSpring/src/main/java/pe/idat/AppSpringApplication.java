package pe.idat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pe.idat.concierto.Banda;

@SpringBootApplication
public class AppSpringApplication implements CommandLineRunner
{
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);
	}

	//método ejecutable
	@Override
	public void run(String... args) throws Exception 
	{
		Banda chicosATE=(Banda)context.getBean("beanBanda");
		
		//imprimir
		chicosATE.realizarPrueba();
	}
}
