package L�gica;

public class Squirtle extends Pokemon implements IAgua{
	//m�todos abstractos en clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Squirtle y ah� va ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Squirtle y ah� va ataque ara�azo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Squirtle y ah� va ataque Mordisco");
	}

	//m�todos abstractos en interfaz IAgua
	@Override
	public void atacarHidroBomba() {
		System.out.println("Soy Squirtle y ah� va ataque hidroBomba");	
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Soy Squirtle y ah� va ataque Burbuja");	
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y ah� va ataque pistola de agua");		
	}
}
