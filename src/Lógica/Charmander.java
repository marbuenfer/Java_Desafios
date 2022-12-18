package Lógica;

public class Charmander extends Pokemon implements IFuego {
	//métodos abstractos declarados en clase Pokemon
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Charmander y ahí va ataque placaje");
	}

	@Override
	protected void atacarArannazo() {
		System.out.println("Soy Charmander y ahí va ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Charmander y ahí va ataque Mordisco");
	}
	
	//métodos abstractos declarados en interfaz IFuego
	@Override
	public void atacarPunnoFuego() {
		System.out.println("Soy Charmander y ahí va ataque puño y fuego");
		
	}

	@Override
	public void atacarLanzaLlamas() {
		System.out.println("Soy Charmander y ahí va ataque lanzar llamas");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y ahí va ataque ascuas");
		
	}
	
	


}
