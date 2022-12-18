package Lógica;

public class Pikachu extends Pokemon implements IElectrico{
	//métodos abstractos declarados en clase Pikachu
	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy pokemon Pikachu y ahí va ataque Placaje");
	}
	@Override
	protected void atacarArannazo() {
		System.out.println("Soy pokemon Pikachu y ahí va ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy pokemon Pikachu y ahí va ataque mordisco");
	}
	
	//métodos declarados en interfaz IElectrico
	@Override
	public void atacarImpactTrueno() {
		System.out.println("Soy pokemon Pikachu y ahí va ataque impacto trueno");		
	}

	@Override
	public void atacarPunnoTrueno() {
		System.out.println("Soy pokemon Pikachu y ahí va ataque puño mordisco");
	}

	 
	
}
