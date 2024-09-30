package pe.idat.instrumentos;

//objeto real
public class Piano implements Instrumento
{
	//método constructor
	public Piano() {}

	@Override
	public void tocar() {
		System.out.println("¡Tocando el Piano!");		
	}
}
