package L�gica;

public class Charmander extends Pokemon implements IFuego {
	//m�todos abstractos declarados en clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Charmander y ah� va ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Charmander y ah� va ataque ara�azo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Charmander y ah� va ataque Mordisco");
	}
	
	//m�todos abstractos declarados en interfaz IFuego
	@Override
	public void atacarPunnoFuego() {
		System.out.println("Soy Charmander y ah� va ataque pu�o y fuego");
		
	}

	@Override
	public void atacarLanzaLlamas() {
		System.out.println("Soy Charmander y ah� va ataque lanzar llamas");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y ah� va ataque ascuas");
		
	}
	
	


}
