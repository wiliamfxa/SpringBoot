package pe.idat.instrumentos;

import org.springframework.stereotype.Component;

@Component("beanPiano")
public class Piano implements Instrumento
{
	//método constructor
	public Piano() {}

	@Override
	public void tocar() {
		System.out.println("¡Tocando el Piano!");		
	}
}
