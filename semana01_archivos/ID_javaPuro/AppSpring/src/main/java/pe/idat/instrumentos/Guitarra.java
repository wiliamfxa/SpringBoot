package pe.idat.instrumentos;

//objeto real
public class Guitarra implements Instrumento
{
	//método constructor
	public Guitarra() {}

	@Override
	public void tocar() {
		System.out.println("¡Tocando la Guitarra!");
	}
}
