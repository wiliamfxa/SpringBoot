package pe.idat.instrumentos;

import org.springframework.stereotype.Component;

@Component("beanGuitarra")
public class Guitarra implements Instrumento
{
	//método constructor
	public Guitarra() {}

	@Override
	public void tocar() {
		System.out.println("¡Tocando la Guitarra!");
	}
}
