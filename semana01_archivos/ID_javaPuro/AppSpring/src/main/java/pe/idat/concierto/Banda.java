package pe.idat.concierto;

import pe.idat.instrumentos.Guitarra;
import pe.idat.instrumentos.Instrumento;
import pe.idat.instrumentos.Piano;

public class Banda 
{
	//dependencia Java Puro
	private Instrumento instrumento=new Piano();
	
	//método constructor
	public Banda() {};
	
	//método normal
	public void realizarPrueba()
	{
		instrumento.tocar();
	}
}
