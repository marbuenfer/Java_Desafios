package Lógica;

public class  Bulbasur extends Pokemon implements IPlanta{

	//métodos abstractos heredados de la clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Bulbasur y ahí va mi ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Bulbasur y ahí va mi ataque arañazo");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Bulbasur y ahí va mi ataque mordisco");

	}

	//métodos abstractos de la interfaz Iplanta
	@Override
	public void atacarDrenaje() {
		System.out.println("Soy Bulbasur y ahí va mi ataque drenaje");

	}

	@Override
	public void atacarParalizar() {
		System.out.println("Soy Bulbasur y ahí va mi ataque paralizar");
	}


}
