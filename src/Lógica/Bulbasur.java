package L�gica;

public class  Bulbasur extends Pokemon implements IPlanta{

	//m�todos abstractos heredados de la clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Bulbasur y ah� va mi ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Bulbasur y ah� va mi ataque ara�azo");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Bulbasur y ah� va mi ataque mordisco");

	}

	//m�todos abstractos de la interfaz Iplanta
	@Override
	public void atacarDrenaje() {
		System.out.println("Soy Bulbasur y ah� va mi ataque drenaje");

	}

	@Override
	public void atacarParalizar() {
		System.out.println("Soy Bulbasur y ah� va mi ataque paralizar");
	}


}
