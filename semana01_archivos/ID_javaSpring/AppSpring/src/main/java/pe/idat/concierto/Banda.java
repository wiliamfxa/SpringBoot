package pe.idat.concierto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pe.idat.instrumentos.Instrumento;

@Component("beanBanda")
public class Banda 
{
	//dependencia Java Spring	
	@Autowired
	@Qualifier("beanPiano")
	private Instrumento instrumento;
	
	//método constructor
	public Banda() {};
	
	//método normal
	public void realizarPrueba()
	{
		instrumento.tocar();
	}
}
