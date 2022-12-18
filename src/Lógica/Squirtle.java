package Lógica;

public class Squirtle extends Pokemon implements IAgua{
	//métodos abstractos en clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Squirtle y ahí va ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Squirtle y ahí va ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Squirtle y ahí va ataque Mordisco");
	}

	//métodos abstractos en interfaz IAgua
	@Override
	public void atacarHidroBomba() {
		System.out.println("Soy Squirtle y ahí va ataque hidroBomba");	
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Soy Squirtle y ahí va ataque Burbuja");	
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y ahí va ataque pistola de agua");		
	}
}
